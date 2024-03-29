/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.miniredsocial;

import Exceptiones.NoExisteUsr;
import com.mycompany.vistas.TimeLine;
import Logica.Func_usuario;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import com.mycompany.vistas.Editar.Editar;
import com.mycompany.vistas.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kelvi
 */
public class FramePrincipal extends javax.swing.JInternalFrame {

    private Func_usuario adm_usr;

    private LabelPerfil foto_img;

    private javax.swing.JDesktopPane escritorio;

    public String nombre;
    public String tipo;

    /**
     * Creates new form FrameSocial
     */
    public FramePrincipal(String user, javax.swing.JDesktopPane escritorio, String nombre, String tipo) throws FileNotFoundException, NoExisteUsr {
        FlatMaterialPalenightIJTheme.setup();
        initComponents();
        this.escritorio = escritorio;
        this.tipo = tipo;
        this.nombre = nombre;
        this.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(66,72,99));
        
        try {
            
            this.adm_usr = new Func_usuario(user);
            
            txtNombre_P.setText(adm_usr.getUser());
            
            ImageIcon icon = new ImageIcon("varios/icon.png");

            LayoutManager main = bgMain.getLayout();
            
            bgMain.setLayout(null);
            
            foto_img = new LabelPerfil(100);
            foto_img.setBounds(70, 20, 100, 100);
            
            foto_img.setIcon(new ImageIcon(adm_usr.getImg_perfil()));
            bgMain.add(foto_img);
            
            bgMain.setLayout(main);

            initContent();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        
        
        
        this.setVisible(true);
    }
    
    private void initContent() throws IOException, FileNotFoundException, NoExisteUsr{
        
        TimeLine pl = new TimeLine( adm_usr);
        
        mostrarContent(pl);
    }
    
    private void mostrarContent(JPanel p){
        
        p.setSize(1110, 830);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backgroud = new javax.swing.JPanel();
        bgMain = new javax.swing.JPanel();
        img_perfil = new javax.swing.JLabel();
        txtNombre_P = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnInteracciones = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnHashtag = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setTitle("MiniRed");
        setFrameIcon(null);
        setMinimumSize(new java.awt.Dimension(1150, 750));
        setPreferredSize(new java.awt.Dimension(1150, 750));

        Backgroud.setBackground(new java.awt.Color(204, 204, 204));
        Backgroud.setMinimumSize(new java.awt.Dimension(1150, 720));
        Backgroud.setName(""); // NOI18N
        Backgroud.setPreferredSize(new java.awt.Dimension(1150, 720));

        bgMain.setBackground(new java.awt.Color(66, 72, 99));
        bgMain.setMinimumSize(new java.awt.Dimension(270, 720));
        bgMain.setPreferredSize(new java.awt.Dimension(270, 720));

        txtNombre_P.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtNombre_P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre_P.setText("Kelvin Melgar");

        btnInicio.setBackground(new java.awt.Color(41, 45, 62));
        btnInicio.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(240, 240, 240));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_text.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setIconTextGap(15);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnInteracciones.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnInteracciones.setForeground(new java.awt.Color(240, 240, 240));
        btnInteracciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_arroba.png"))); // NOI18N
        btnInteracciones.setText("Interacciones");
        btnInteracciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1));
        btnInteracciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInteracciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInteracciones.setIconTextGap(15);
        btnInteracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteraccionesActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(240, 240, 240));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_editar.png"))); // NOI18N
        btnEditar.setText("Editar Perfil");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.setIconTextGap(15);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnHashtag.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnHashtag.setForeground(new java.awt.Color(240, 240, 240));
        btnHashtag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-hash.png"))); // NOI18N
        btnHashtag.setText("Hasthag");
        btnHashtag.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1));
        btnHashtag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHashtag.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHashtag.setIconTextGap(15);
        btnHashtag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashtagActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_salir.png"))); // NOI18N
        btnSalir.setText("Cerrar sesion");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(15);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retro-torch.gif"))); // NOI18N

        javax.swing.GroupLayout bgMainLayout = new javax.swing.GroupLayout(bgMain);
        bgMain.setLayout(bgMainLayout);
        bgMainLayout.setHorizontalGroup(
            bgMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMainLayout.createSequentialGroup()
                .addGroup(bgMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre_P, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInteracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgMainLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(bgMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img_perfil)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        bgMainLayout.setVerticalGroup(
            bgMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgMainLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(img_perfil)
                .addGap(117, 117, 117)
                .addComponent(txtNombre_P, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnInteracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        content.setMinimumSize(new java.awt.Dimension(910, 720));
        content.setPreferredSize(new java.awt.Dimension(910, 720));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroudLayout = new javax.swing.GroupLayout(Backgroud);
        Backgroud.setLayout(BackgroudLayout);
        BackgroudLayout.setHorizontalGroup(
            BackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroudLayout.createSequentialGroup()
                .addComponent(bgMain, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroudLayout.setVerticalGroup(
            BackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectB(JButton p){
        
        JButton[] botones = {btnEditar, btnHashtag, btnInteracciones, btnInicio };
        
        for(JButton b : botones){
            if(b == p)
                b.setBackground(new Color(41,45,62));
            else
                b.setBackground(new Color(66,72,99));
        }
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:

        Editar p = new Editar(adm_usr, this, escritorio, nombre, tipo);
        p.setLocation(0, 0);
        p.setSize(1110, 870);
        
        LayoutManager e = p.getLayout();
        content.removeAll();
        content.add(p);
        content.revalidate();
        content.repaint();
        
        selectB(btnEditar);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnHashtagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashtagActionPerformed
        // TODO add your handling code here:

        Hashtag p;
        try {
            p = new Hashtag(adm_usr);
            mostrarContent(p);
            selectB(btnHashtag);
        } catch (IOException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHashtagActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        LogIn p =  new LogIn(escritorio, nombre, tipo);
        escritorio.add(p);
        p.show();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInteraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteraccionesActionPerformed
        // TODO add your handling code here:
        Interacciones p;
        try {

            p = new Interacciones(adm_usr);
            LayoutManager e = p.getLayout();
            mostrarContent(p);
            selectB(btnInteracciones);
        } catch (IOException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInteraccionesActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        //Principal pl = new Principal();

        TimeLine pl;

        try {
            pl = new TimeLine(adm_usr);

            mostrarContent(pl);
            selectB(btnInicio);
            this.repaint();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error: " +ex.getMessage());
        } catch (NoExisteUsr ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnInicioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgroud;
    private javax.swing.JPanel bgMain;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHashtag;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInteracciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel content;
    private javax.swing.JLabel img_perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtNombre_P;
    // End of variables declaration//GEN-END:variables
}
