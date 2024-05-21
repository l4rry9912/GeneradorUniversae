/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Pregunta extends javax.swing.JPanel {
        Simulador1 simulador1;
        
    public Pregunta(Simulador1 simulador1, ArrayList<Pregunta> listaPreguntas) {
        initComponents();
        this.simulador1 = simulador1;
        ImagenFondo.setSize(new Dimension(430,230));
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

        bg = new javax.swing.JPanel();
        Pregunta = new javax.swing.JLabel();
        TextoPregunta = new javax.swing.JTextField();
        RespuestaCorrecta = new javax.swing.JLabel();
        Correcta = new javax.swing.JTextField();
        RespuestaIncorrecta = new javax.swing.JLabel();
        Incorrecta1 = new javax.swing.JTextField();
        Incorrecta2 = new javax.swing.JTextField();
        Incorrecta3 = new javax.swing.JTextField();
        btnMenos = new javax.swing.JLabel();
        ImagenFondo = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(26, 40, 55));
        bg.setOpaque(false);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pregunta.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        Pregunta.setForeground(new java.awt.Color(200, 203, 207));
        Pregunta.setText("Pregunta");
        bg.add(Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 153, 26));

        TextoPregunta.setBackground(new java.awt.Color(72, 82, 93));
        TextoPregunta.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        TextoPregunta.setForeground(new java.awt.Color(200, 203, 207));
        TextoPregunta.setBorder(null);
        TextoPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPreguntaActionPerformed(evt);
            }
        });
        bg.add(TextoPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 320, 40));

        RespuestaCorrecta.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        RespuestaCorrecta.setForeground(new java.awt.Color(200, 203, 207));
        RespuestaCorrecta.setText("Respuesta Correcta");
        bg.add(RespuestaCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 370, -1));

        Correcta.setBackground(new java.awt.Color(72, 82, 93));
        Correcta.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Correcta.setForeground(new java.awt.Color(200, 203, 207));
        Correcta.setBorder(null);
        Correcta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrectaActionPerformed(evt);
            }
        });
        bg.add(Correcta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 30));

        RespuestaIncorrecta.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        RespuestaIncorrecta.setForeground(new java.awt.Color(200, 203, 207));
        RespuestaIncorrecta.setText("Respuestas Incorrectas");
        bg.add(RespuestaIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 370, -1));

        Incorrecta1.setBackground(new java.awt.Color(72, 82, 93));
        Incorrecta1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Incorrecta1.setForeground(new java.awt.Color(200, 203, 207));
        Incorrecta1.setBorder(null);
        Incorrecta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Incorrecta1ActionPerformed(evt);
            }
        });
        bg.add(Incorrecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 320, -1));

        Incorrecta2.setBackground(new java.awt.Color(72, 82, 93));
        Incorrecta2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Incorrecta2.setForeground(new java.awt.Color(200, 203, 207));
        Incorrecta2.setBorder(null);
        bg.add(Incorrecta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, -1));

        Incorrecta3.setBackground(new java.awt.Color(72, 82, 93));
        Incorrecta3.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Incorrecta3.setForeground(new java.awt.Color(200, 203, 207));
        Incorrecta3.setBorder(null);
        Incorrecta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Incorrecta3ActionPerformed(evt);
            }
        });
        bg.add(Incorrecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, -1));

        btnMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menos_Off.png"))); // NOI18N
        btnMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosMouseExited(evt);
            }
        });
        bg.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 220));

        ImagenFondo.setBackground(new java.awt.Color(255, 255, 255));
        add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void TextoPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPreguntaActionPerformed

    private void Incorrecta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Incorrecta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Incorrecta3ActionPerformed

    private void CorrectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorrectaActionPerformed

    private void Incorrecta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Incorrecta1ActionPerformed
        
    }//GEN-LAST:event_Incorrecta1ActionPerformed

    private void btnMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseClicked
     
            int index = simulador1.getIndexOfPregunta(this); 
            simulador1.eliminarPregunta(index); 
             
         
    }//GEN-LAST:event_btnMenosMouseClicked

    private void btnMenosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseEntered
        SetImageLabel(btnMenos, "src/imagenes/Menos_On.png");
    }//GEN-LAST:event_btnMenosMouseEntered

    private void btnMenosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseExited
        SetImageLabel(btnMenos, "src/imagenes/Menos_Off.png");
    }//GEN-LAST:event_btnMenosMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Correcta;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JTextField Incorrecta1;
    private javax.swing.JTextField Incorrecta2;
    private javax.swing.JTextField Incorrecta3;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JLabel RespuestaCorrecta;
    private javax.swing.JLabel RespuestaIncorrecta;
    private javax.swing.JTextField TextoPregunta;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnMenos;
    // End of variables declaration//GEN-END:variables
}
