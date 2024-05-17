/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Pregunta extends javax.swing.JPanel {

    
    public Pregunta() {
        initComponents();
        ImagenFondo.setSize(new Dimension(430, 230));
        SetImageLabel(ImagenFondo, "src/imagenes/Panel_Principal.png");
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

        jPanel1 = new javax.swing.JPanel();
        Pregunta = new javax.swing.JLabel();
        TextoPregunta = new javax.swing.JTextField();
        RespuestaCorrecta = new javax.swing.JLabel();
        Correcta = new javax.swing.JTextField();
        RespuestaIncorrecta = new javax.swing.JLabel();
        Incorrecta1 = new javax.swing.JTextField();
        Incorrecta2 = new javax.swing.JTextField();
        Incorrecta3 = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JLabel();
        ImagenFondo = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(26, 40, 55));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pregunta.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        Pregunta.setForeground(new java.awt.Color(200, 203, 207));
        Pregunta.setText("Pregunta");
        jPanel1.add(Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 153, 26));

        TextoPregunta.setBackground(new java.awt.Color(72, 82, 93));
        TextoPregunta.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        TextoPregunta.setForeground(new java.awt.Color(200, 203, 207));
        TextoPregunta.setText("jTextField2");
        TextoPregunta.setBorder(null);
        TextoPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPreguntaActionPerformed(evt);
            }
        });
        jPanel1.add(TextoPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 340, 40));

        RespuestaCorrecta.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        RespuestaCorrecta.setForeground(new java.awt.Color(200, 203, 207));
        RespuestaCorrecta.setText("Respuesta Correcta");
        jPanel1.add(RespuestaCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 370, -1));

        Correcta.setBackground(new java.awt.Color(72, 82, 93));
        Correcta.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Correcta.setForeground(new java.awt.Color(200, 203, 207));
        Correcta.setText("jTextField1");
        Correcta.setBorder(null);
        jPanel1.add(Correcta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 340, 30));

        RespuestaIncorrecta.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        RespuestaIncorrecta.setForeground(new java.awt.Color(200, 203, 207));
        RespuestaIncorrecta.setText("Respuestas Incorrectas");
        jPanel1.add(RespuestaIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 370, -1));

        Incorrecta1.setBackground(new java.awt.Color(72, 82, 93));
        Incorrecta1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Incorrecta1.setForeground(new java.awt.Color(200, 203, 207));
        Incorrecta1.setText("jTextField3");
        Incorrecta1.setBorder(null);
        jPanel1.add(Incorrecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 360, -1));

        Incorrecta2.setBackground(new java.awt.Color(72, 82, 93));
        Incorrecta2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Incorrecta2.setForeground(new java.awt.Color(200, 203, 207));
        Incorrecta2.setText("jTextField4");
        Incorrecta2.setBorder(null);
        jPanel1.add(Incorrecta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 360, -1));

        Incorrecta3.setBackground(new java.awt.Color(72, 82, 93));
        Incorrecta3.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Incorrecta3.setForeground(new java.awt.Color(200, 203, 207));
        Incorrecta3.setText("jTextField5");
        Incorrecta3.setBorder(null);
        jPanel1.add(Incorrecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 360, -1));

        BtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menos_Off.png"))); // NOI18N
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseExited(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 40));

        ImagenFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 450, 240));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseEntered
        SetImageLabel(BtnEliminar, "src/imagenes/Menos_On.png");
    }//GEN-LAST:event_BtnEliminarMouseEntered

    private void BtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseExited
        SetImageLabel(BtnEliminar, "src/imagenes/Menos_Off.png");
    }//GEN-LAST:event_BtnEliminarMouseExited

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void TextoPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPreguntaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnEliminar;
    private javax.swing.JTextField Correcta;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JTextField Incorrecta1;
    private javax.swing.JTextField Incorrecta2;
    private javax.swing.JTextField Incorrecta3;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JLabel RespuestaCorrecta;
    private javax.swing.JLabel RespuestaIncorrecta;
    private javax.swing.JTextField TextoPregunta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
