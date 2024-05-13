/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Simulador1 extends javax.swing.JPanel {

    /**
     * Creates new form Simulador1
     */
    public Simulador1() {
        initComponents();
    }

    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon ( image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        AñadirPregunta = new javax.swing.JLabel();
        Informacion = new javax.swing.JLabel();
        Añadir = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AñadirPregunta.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        AñadirPregunta.setForeground(new java.awt.Color(255, 255, 255));
        AñadirPregunta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AñadirPregunta.setText("Añadir una pregunta");
        bg.add(AñadirPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 30));

        Informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info_Off.png"))); // NOI18N
        Informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InformacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InformacionMouseExited(evt);
            }
        });
        bg.add(Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mas_Off.png"))); // NOI18N
        Añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AñadirMouseExited(evt);
            }
        });
        bg.add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        Fondo.setText("jLabel1");
        bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirMouseClicked

    private void AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseEntered
        SetImageLabel(Añadir, "src/imagenes/Mas_On.png");
    }//GEN-LAST:event_AñadirMouseEntered

    private void AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseExited
        SetImageLabel(Añadir, "src/imagenes/Mas_Off.png");
    }//GEN-LAST:event_AñadirMouseExited

    private void InformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InformacionMouseClicked

    private void InformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseEntered
        SetImageLabel(Informacion, "src/imagenes/Info_On.png");
    }//GEN-LAST:event_InformacionMouseEntered

    private void InformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseExited
        SetImageLabel(Informacion, "src/imagenes/Info_Off.png");
    }//GEN-LAST:event_InformacionMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Añadir;
    private javax.swing.JLabel AñadirPregunta;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Informacion;
    private javax.swing.JPanel bg;
    // End of variables declaration//GEN-END:variables
}
