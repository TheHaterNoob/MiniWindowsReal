package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class ManejoFiles extends javax.swing.JInternalFrame {

    JPopupMenu popupMenu = new JPopupMenu();
    public static String nombre;
    public static String tipo;
    int refresh = 0;
    File selectedFile;
    private FileSystemModel fileSystemModel;

    public ManejoFiles() {
        initComponents();
        File rootDirectory = new File("/");
        fileSystemModel = new FileSystemModel(rootDirectory);

        JMenuItem copyItem = new JMenuItem("Copiar");
        JMenuItem cutItem = new JMenuItem("Cortar");
        JMenuItem pasteItem = new JMenuItem("Pegar");
        JMenuItem rename = new JMenuItem("Renombrar");
        JMenuItem refreshyep = new JMenuItem("Refrescar");
        JMenuItem createfile = new JMenuItem("Nuevo Archivo");
        JMenuItem createfolder = new JMenuItem("Nuevo Folder");
        JMenuItem organizar = new JMenuItem("Organizar");
        JMenuItem sortName = new JMenuItem("Ver por Nombre");
        JMenuItem sortDate = new JMenuItem("Ver por Fecha");
        popupMenu.add(copyItem);
        popupMenu.add(cutItem);
        popupMenu.add(pasteItem);
        popupMenu.add(rename);
        popupMenu.add(refreshyep);
        popupMenu.add(createfile);
        popupMenu.add(createfolder);
        popupMenu.add(organizar);
        popupMenu.add(sortName);
        popupMenu.add(sortDate);

        jTree1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        copyItem.setAction(new AbstractAction("Copy") {
            public void actionPerformed(ActionEvent e) {
                selectedFile = (File) jTree1.getLastSelectedPathComponent();
                copyFile(selectedFile);
            }
        });

        cutItem.setAction(new AbstractAction("Cut") {
            public void actionPerformed(ActionEvent e) {
                selectedFile = (File) jTree1.getLastSelectedPathComponent();
                cutFile(selectedFile);
            }
        });

        pasteItem.setAction(new AbstractAction("Paste") {
            public void actionPerformed(ActionEvent e) {
                File LastFile = (File) jTree1.getLastSelectedPathComponent();
                pasteFile(LastFile);
            }
        });
        refreshyep.setAction(new AbstractAction("Refresh") {
            public void actionPerformed(ActionEvent e) {
                refreshing();
            }
        });
        createfile.setAction(new AbstractAction("New File") {
            public void actionPerformed(ActionEvent e) {
                selectedFile = (File) jTree1.getLastSelectedPathComponent();
                try {
                    newFile(selectedFile);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR (usualmente es por no seleccionar un folder)", "ERROR", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(ManejoFiles.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        createfolder.setAction(new AbstractAction("New Folder") {
            public void actionPerformed(ActionEvent e) {
                selectedFile = (File) jTree1.getLastSelectedPathComponent();
                try {
                    newFolder(selectedFile);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR (usualmente es por no seleccionar un folder)", "ERROR", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(ManejoFiles.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        rename.setAction(new AbstractAction("Renombrar") {
            public void actionPerformed(ActionEvent e) {
                selectedFile = (File) jTree1.getLastSelectedPathComponent();
                String renombre = JOptionPane.showInputDialog(null, "renombrar", null);
                try {
                    rename(selectedFile, renombre);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(ManejoFiles.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        organizar.setAction(new AbstractAction("Organizar") {
            public void actionPerformed(ActionEvent e) {
                selectedFile = (File) jTree1.getLastSelectedPathComponent();
                if (selectedFile.isDirectory()) {
                    organizar(selectedFile);
                }else{
                JOptionPane.showMessageDialog(null, "por favor seleccione un folder", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        sortName.setAction(new AbstractAction("Sort by Name") {
            public void actionPerformed(ActionEvent e) {
                sortbyName();
            }
        });
        sortDate.setAction(new AbstractAction("Sort by Date") {
            public void actionPerformed(ActionEvent e) {
                sortbyDate();
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mis Archivos");

        jTree1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTree1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTree1FocusGained
        if (refresh == 0) {
            refresh++;
            if (tipo.equals("Administrador")) {
                jTree1.setModel(new FileSystemModel(new File("Z")));
            } else {
                jTree1.setModel(new FileSystemModel(new File("Z/" + nombre)));
            }
        }
    }//GEN-LAST:event_jTree1FocusGained
    private void copyFile(File file) {
        fileSystemModel.copyFile(file);
    }

    private void cutFile(File file) {
        fileSystemModel.cutFile(file);
    }

    private void pasteFile(File destinationFolder) {
        try {
            fileSystemModel.pasteFile(destinationFolder);
            refreshing();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR (usualmente es por no seleccionar un folder)", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void refreshing() {
        if (tipo.equals("Administrador")) {
            FileSystemModel model = new FileSystemModel(new File("Z"));
            model.refresh();
            jTree1.setModel(model);
        } else {
            FileSystemModel model = new FileSystemModel(new File("Z/" + nombre));
            model.refresh();
            jTree1.setModel(model);
        }
    }

    private void sortbyName() {
        if (tipo.equals("Administrador")) {
            fileSystemModel.sortByName(new File("Z"));
        } else {
            fileSystemModel.sortByName(new File("Z/" + nombre));
        }

    }

    private void sortbyDate() {
        if (tipo.equals("Administrador")) {
            fileSystemModel.sortByDate(new File("Z"));
        } else {
            fileSystemModel.sortByDate(new File("Z/" + nombre));
        }

    }

    private void newFile(File file) throws IOException {
        fileSystemModel.createFile(file, "New File");
        refreshing();
    }

    private void newFolder(File file) throws IOException {
        fileSystemModel.createFolder(file, "New Folder");
        refreshing();
    }

    private void rename(File file, String string) throws IOException {
        fileSystemModel.rename(file, string);
        refreshing();
    }

    private void organizar(File file) {
        fileSystemModel.sortFiles(file);
        refreshing();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
