/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.miniredsocial;

import Exceptiones.NoExisteUsr;
import Logica.Func_usuario;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kelvi
 */
public class LogIn extends javax.swing.JInternalFrame {

    /**
     * Creates new form LogIn
     */
    
    private RandomAccessFile f_usuarios;
    
    private javax.swing.JDesktopPane escritorio;
    
    public LogIn(javax.swing.JDesktopPane escritorio) {
        
        FlatMaterialPalenightIJTheme.setup();
        initComponents();
        this.setVisible(true);
        
        this.escritorio = escritorio;
        try{
            
            File mf = new File("RedRetro");
            mf.mkdir();
            Font miFuente = Font.createFont(Font.TRUETYPE_FONT, new File("varios/1up.ttf")).deriveFont(60f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(miFuente);

            ImageIcon icon = new ImageIcon("varios/icon.png");

            
            f_usuarios = new RandomAccessFile("RedRetro/usuarios.twc", "rw");
            lblTitulo.setFont(miFuente);
            lblTitulo.setForeground(new Color(207, 9, 184));

        } catch (IOException e) {

        } catch (FontFormatException e) {

        }

        this.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(9,26,52));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        btnCrearUsuario = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(41, 45, 62));
        setClosable(true);
        setIconifiable(true);
        setTitle("MiniRed");
        setFrameIcon(null);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retro-futuristic-80s-background-free-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 718, 900));

        lblTitulo.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        lblTitulo.setText("RetroRed");
        lblTitulo.setToolTipText("");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 522, 88));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 28)); // NOI18N
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 198, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtUsuario.setMargin(new java.awt.Insets(10, 10, 10, 10));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 254, 516, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 28)); // NOI18N
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 362, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 612, 10));

        btnIngresar.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, 313, 43));

        btnCrearUsuario.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 850, -1, -1));

        txtContra.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtContra.setMargin(new java.awt.Insets(10, 10, 10, 10));
        txtContra.setPreferredSize(new java.awt.Dimension(146, 49));
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 413, 516, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/technyancolor.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 160, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/balloon.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 710, 90, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
       
        
        try {
            if (Func_usuario.existeUsuario(txtUsuario.getText(), f_usuarios)) {
                
                if(f_usuarios.readUTF().equals(txtContra.getText())) {
                    
                    Func_usuario temp = new Func_usuario(txtUsuario.getText());
                    
                    if (temp.isActivo()) {

                        this.dispose();
                        FramePrincipal p = new FramePrincipal(txtUsuario.getText(), escritorio);
                        escritorio.add(p);
                        p.show();

                    } else {

                        JOptionPane.showMessageDialog(this, "Su cuenta se ha reactivado", "LogIng",
                                JOptionPane.WARNING_MESSAGE);
                        temp.actUsuario();
                        
                        
                        this.dispose();
                        FramePrincipal p = new FramePrincipal(txtUsuario.getText(), escritorio);
                        escritorio.add(p);
                        p.show();
                        
                        
                    }

                } else {

                    JOptionPane.showMessageDialog(this, "Contraseña invalida", "LogIng",
                             JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no existe", "LogIng",
                         JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }catch (NoExisteUsr ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        // TODO add your handling code here:
        
        CrearUsuario p = new CrearUsuario(this);
        
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
