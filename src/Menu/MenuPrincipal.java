package Menu;

import Usuarios.*;
import cmd.principal;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;
import com.mycompany.miniredsocial.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import reproductor.propio.Reproductor;
import texteditor.*;

public class MenuPrincipal extends javax.swing.JFrame {

    public static String nombreIngresado;
    public String tipoIngresado;
    public String contra;

    CrearcionUsuarios CU = new CrearcionUsuarios();
    ManejoFiles MF = new ManejoFiles();

    public MenuPrincipal() {
        FlatDraculaIJTheme.setup();

        this.setUndecorated(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setPreferredSize(screenSize);

        this.setMaximumSize(screenSize);
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        ImageIcon imageIcon = new ImageIcon("fondo1.jpg");
        JLabel backgroundLabel = new JLabel(imageIcon);

        backgroundLabel.setBounds(0, 0, Escritorio.getWidth(), Escritorio.getHeight());

        Escritorio.add(backgroundLabel, new Integer(Integer.MIN_VALUE));
        Escritorio.setComponentZOrder(backgroundLabel, 0);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        CreacionUsuarios = new javax.swing.JMenu();
        FileManager = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 810));

        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 810));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 810));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1103, Short.MAX_VALUE))
            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1368, Short.MAX_VALUE)))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))))
            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLayout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(623, Short.MAX_VALUE)))
        );

        jPanel1.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 810));

        jMenuBar1.setForeground(new java.awt.Color(240, 240, 240));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1093, 100));

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
        FileManager.setText("Navegador de Archivos");
        FileManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FileManagerMouseClicked(evt);
            }
        });
        jMenuBar1.add(FileManager);

        jMenu4.setForeground(new java.awt.Color(240, 240, 240));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.png"))); // NOI18N
        jMenu4.setText("Imagenes");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(240, 240, 240));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/music.png"))); // NOI18N
        jMenu5.setText("Musica");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(240, 240, 240));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/word.png"))); // NOI18N
        jMenu6.setText("word");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setForeground(new java.awt.Color(240, 240, 240));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cmd.png"))); // NOI18N
        jMenu7.setText("cmd");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu3.setForeground(new java.awt.Color(240, 240, 240));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rsz_screenshot_7.png"))); // NOI18N
        jMenu3.setText("MiniRed");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu2.setForeground(new java.awt.Color(240, 240, 240));
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        principal cmd = new principal();
        cmd.nombre=this.nombreIngresado;
        cmd.tipo = this.tipoIngresado;
        Escritorio.add(cmd);
        cmd.show();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        Reproductor spotify = new Reproductor();
        spotify.nombre = this.nombreIngresado;
        spotify.tipo = this.tipoIngresado;
        Escritorio.add(spotify);

        spotify.show();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:

        LogIn mp = new LogIn(Escritorio);

        mp.setVisible(true);
        Escritorio.add(mp);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
           Reproductor spotify = new Reproductor();
        spotify.nombre = this.nombreIngresado;
        spotify.tipo = this.tipoIngresado;
        Escritorio.add(spotify);

        spotify.show();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       Principal word = new Principal();
        word.nombre = this.nombreIngresado;
        word.tipo = this.tipoIngresado;
        Escritorio.add(word);
        word.show();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        principal cmd = new principal();
        cmd.nombre=this.nombreIngresado;
        cmd.tipo = this.tipoIngresado;
        Escritorio.add(cmd);
        cmd.show();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Imagenes XD = new Imagenes();

        Escritorio.add(XD);
        XD.show();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
          ManejoFiles MF = new ManejoFiles();
        MF.nombre = this.nombreIngresado;
        MF.tipo = this.tipoIngresado;

        Escritorio.add(MF);
        MF.show();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       LogIn mp = new LogIn(Escritorio);

        mp.setVisible(true);
        Escritorio.add(mp);
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CreacionUsuarios;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu FileManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
