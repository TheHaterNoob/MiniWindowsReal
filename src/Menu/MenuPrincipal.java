package Menu;

import Usuarios.*;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import texteditor.*;

public class MenuPrincipal extends javax.swing.JFrame {

    public String nombreIngresado;
    public String tipoIngresado;
    public String contra;

    CrearcionUsuarios CU = new CrearcionUsuarios();
    ManejoFiles MF = new ManejoFiles();

    public MenuPrincipal() {
        FlatDraculaIJTheme.setup();

        this.setUndecorated(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setPreferredSize(screenSize);

        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        jMenuBar1.setAlignmentX(CENTER_ALIGNMENT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        CreacionUsuarios = new javax.swing.JMenu();
        FileManager = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        jMenuBar1.setForeground(new java.awt.Color(240, 240, 240));

        CreacionUsuarios.setForeground(new java.awt.Color(240, 240, 240));
        CreacionUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarUser.png"))); // NOI18N
        CreacionUsuarios.setText("Crear Usuarios");
        CreacionUsuarios.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                CreacionUsuariosMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        CreacionUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreacionUsuariosMouseClicked(evt);
            }
        });
        CreacionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreacionUsuariosActionPerformed(evt);
            }
        });
        jMenuBar1.add(CreacionUsuarios);

        FileManager.setForeground(new java.awt.Color(240, 240, 240));
        FileManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MisDocumentos.png"))); // NOI18N
        FileManager.setText("Navedor y Organizador de Archivos");
        FileManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FileManagerMouseClicked(evt);
            }
        });
        jMenuBar1.add(FileManager);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.png"))); // NOI18N
        jMenu4.setText("Imagenes");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/music.png"))); // NOI18N
        jMenu5.setText("Musica");
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/word.png"))); // NOI18N
        jMenu6.setText("word");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gnome_application_exit.png"))); // NOI18N
        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreacionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreacionUsuariosActionPerformed

    }//GEN-LAST:event_CreacionUsuariosActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void CreacionUsuariosMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_CreacionUsuariosMenuKeyPressed

    }//GEN-LAST:event_CreacionUsuariosMenuKeyPressed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

        Inicio ingreso = new Inicio();
        ingreso.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void CreacionUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreacionUsuariosMouseClicked

        if ("Administrador".equals(tipoIngresado)) {
            Escritorio.add(CU);
            CU.show();
        } else {
            JOptionPane.showMessageDialog(this, "Esta opcion no esta disponible para usted!");
        }
    }//GEN-LAST:event_CreacionUsuariosMouseClicked

    private void FileManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FileManagerMouseClicked
        ManejoFiles MF = new ManejoFiles();
        MF.nombre = this.nombreIngresado;
        MF.tipo = this.tipoIngresado;

        Escritorio.add(MF);
        MF.show();
    }//GEN-LAST:event_FileManagerMouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Imagenes XD = new Imagenes();
        Escritorio.add(XD);
        XD.show();

    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        Principal word = new Principal();
        word.nombre = this.nombreIngresado;
        word.tipo = this.tipoIngresado;
        Escritorio.add(word);
        word.show();

    }//GEN-LAST:event_jMenu6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CreacionUsuarios;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu FileManager;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
