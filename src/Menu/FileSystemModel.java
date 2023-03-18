package Menu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class FileSystemModel implements TreeModel {

    private File root;
    private Vector listeners = new Vector();

    private File copiedFile;
    private boolean isCut;

    public FileSystemModel(File rootDirectory) {
        root = rootDirectory;
    }

    public Object getRoot() {
        return root;

    }

    public Object getChild(Object parent, int index) {
        File directory = (File) parent;
        String[] children = directory.list();
        for (int j = 0; j < children.length; j++) {
            System.out.println(children[j]);
        }

        return new FileSystemModel.TreeFile(directory, children[index]);
    }

    public int getChildCount(Object parent) {
        File file = (File) parent;
        if (file.isDirectory()) {
            String[] fileList = file.list();

            if (fileList != null) {
                return file.list().length;
            }
        }
        return 0;
    }

    public boolean isLeaf(Object node) {
        File file = (File) node;
        return file.isFile();
    }

    public int getIndexOfChild(Object parent, Object child) {
        File directory = (File) parent;
        File file = (File) child;
        String[] children = directory.list();
        for (int i = 0; i < children.length; i++) {
            if (file.getName().equals(children[i])) {
                return i;
            }
        }
        return -1;

    }

    public void valueForPathChanged(TreePath path, Object value) {
        File oldFile = (File) path.getLastPathComponent();
        String fileParentPath = oldFile.getParent();
        String newFileName = (String) value;
        File targetFile = new File(fileParentPath, newFileName);
        oldFile.renameTo(targetFile);
        File parent = new File(fileParentPath);
        int[] changedChildrenIndices = {getIndexOfChild(parent, targetFile)};
        Object[] changedChildren = {targetFile};
        fireTreeNodesChanged(path.getParentPath(), changedChildrenIndices, changedChildren);

    }

    private void fireTreeNodesChanged(TreePath parentPath, int[] indices, Object[] children) {
        TreeModelEvent event = new TreeModelEvent(this, parentPath, indices, children);
        Iterator iterator = listeners.iterator();
        TreeModelListener listener = null;
        while (iterator.hasNext()) {
            listener = (TreeModelListener) iterator.next();
            listener.treeNodesChanged(event);
        }
    }

    public void addTreeModelListener(TreeModelListener listener) {
        listeners.add(listener);
    }

    public void removeTreeModelListener(TreeModelListener listener) {
        listeners.remove(listener);
    }

    private class TreeFile extends File {

        public TreeFile(File parent, String child) {
            super(parent, child);
        }

        public String toString() {
            return getName();
        }
    }

    public void copyFile(File file) {
        copiedFile = file;
        isCut = false;
    }

    public void cutFile(File file) {
        copiedFile = file;
        isCut = true;
    }

    public void pasteFile(File destinationFolder) throws IOException {
        if (copiedFile == null) {
            System.out.println("PAIN AAA");
            return;
        }

        if (!destinationFolder.isDirectory()) {
            throw new IllegalArgumentException("Destino no es un folder ");
        }

        if (!destinationFolder.exists()) {
            throw new IOException("Destino no existe");
        }

        if (destinationFolder.equals(copiedFile.getParentFile())) {
            return;
        }

        File targetFile = new File(destinationFolder, copiedFile.getName());

        if (isCut) {
            Files.move(copiedFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } else {
            Files.copy(copiedFile.toPath(), targetFile.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
        }

        copiedFile = null;
    }

    public void sortByName(File root) {
        File[] files = root.listFiles();
        Arrays.sort(files, (file1, file2) -> file1.getName().compareTo(file2.getName()));
        for (File file : files) {
            if (file.isDirectory()) {
                sortByName(file);
            }
        }
    }

    public void sortByDate(File root) {
        File[] files = root.listFiles();
        Arrays.sort(files, (file1, file2) -> Long.compare(file1.lastModified(), file2.lastModified()));
        for (File file : files) {
            if (file.isDirectory()) {
                sortByDate(file);
            }
        }
    }

    public void sortBySize(File root) {
        File[] files = root.listFiles();
        Arrays.sort(files, (file1, file2) -> Long.compare(file1.length(), file2.length()));
        for (File file : files) {
            if (file.isDirectory()) {
                sortBySize(file);
            }
        }
    }

    public void sortByType(File root) {
        File[] files = root.listFiles();
        Arrays.sort(files, (file1, file2) -> {
            if (file1.isDirectory() && !file2.isDirectory()) {
                return -1;
            } else if (!file1.isDirectory() && file2.isDirectory()) {
                return 1;
            } else {
                return file1.getName().compareTo(file2.getName());
            }
        });
        for (File file : files) {
            if (file.isDirectory()) {
                sortByType(file);
            }
        }
    }
}