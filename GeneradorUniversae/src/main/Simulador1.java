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
    
    public GeneradorBase parent;
    public int indiceGradoActual = 0;
    boolean botonPresionado = false;
    boolean infoVisible = false;
  
   

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
        txtPreguntas = new javax.swing.JLabel();
        btn_Mas = new javax.swing.JLabel();
        btn_Info = new javax.swing.JLabel();
        imagenInfo = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(5, 19, 36));
        bg.setForeground(new java.awt.Color(5, 19, 36));
        bg.setMinimumSize(new java.awt.Dimension(460, 760));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPreguntas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPreguntas.setForeground(new java.awt.Color(255, 255, 255));
        txtPreguntas.setText("Añadir preguntas");
        bg.add(txtPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 6, 253, 49));

        btn_Mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mas_Off.png"))); // NOI18N
        btn_Mas.setText("jLabel1");
        btn_Mas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MasMouseExited(evt);
            }
        });
        bg.add(btn_Mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 15, 37, -1));

        btn_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info_Off.png"))); // NOI18N
        btn_Info.setText("jLabel1");
        btn_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InfoMouseExited(evt);
            }
        });
        bg.add(btn_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 15, 37, -1));

        imagenInfo.setText("jLabel1");
        bg.add(imagenInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 61, 424, 103));

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

    private void btn_MasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MasMouseClicked

    private void btn_MasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MasMouseEntered

    private void btn_MasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MasMouseExited

    private void btn_InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMouseClicked
        infoVisible = !infoVisible; 
        botonPresionado = infoVisible; 
        if (infoVisible) {
            SetImageLabel(imagenInfo, "src/imagenes/Panel_Info.png");
            SetImageLabel(btn_Info, "src/imagenes/Info_On.png"); 
            imagenInfo.setVisible(true); 
        } else {
            SetImageLabel(btn_Info, "src/imagenes/Info_Off.png"); 
            if (!botonPresionado) { 
                imagenInfo.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_InfoMouseClicked

    private void btn_InfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMouseEntered
           if (!botonPresionado) { 
                SetImageLabel(btn_Info, "src/imagenes/Info_On.png");
    }
    }//GEN-LAST:event_btn_InfoMouseEntered

    private void btn_InfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMouseExited
            if (!botonPresionado) { 
                SetImageLabel(btn_Info, "src/imagenes/Info_Off.png");
    }

    }//GEN-LAST:event_btn_InfoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btn_Info;
    private javax.swing.JLabel btn_Mas;
    private javax.swing.JLabel imagenInfo;
    private javax.swing.JLabel txtPreguntas;
    // End of variables declaration//GEN-END:variables
}
