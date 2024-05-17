/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Usuario
 */
public class Simulador1 extends javax.swing.JPanel {
    
    public GeneradorBase parent;
    public int indiceGradoActual = 0;
    boolean botonPresInfo = false;
    boolean infoVisible = false;
    
    public Simulador1() {
        initComponents();
        panelPreguntas = new JPanel();
        panelPreguntas.setLayout(new BoxLayout(panelPreguntas, BoxLayout.Y_AXIS));
        
        // Agregar el panel de preguntas a este panel (Simulador1)
        add(panelPreguntas);
        JScrollPane scrollPane = new JScrollPane(panelPreguntas);
    
    // Agrega el JScrollPane al panel principal
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0)); // Oculta la barra de desplazamiento vertical
        
        // Hace que el JScrollPane sea transparente
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        
        // Agrega el JScrollPane al panel principal
        add(scrollPane);
        
    
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

        contentBtns = new javax.swing.JPanel();
        txt = new javax.swing.JLabel();
        btn_Mas = new javax.swing.JLabel();
        btn_Info = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        txtInfo = new javax.swing.JLabel();
        imagenInfo = new javax.swing.JLabel();
        panelPreguntas = new javax.swing.JPanel();
        imagenPregunta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(5, 19, 36));
        setForeground(new java.awt.Color(5, 19, 36));
        setPreferredSize(new java.awt.Dimension(460, 760));

        contentBtns.setBackground(new java.awt.Color(5, 19, 36));

        txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setText("Añadir una pregunta                            ");
        contentBtns.add(txt);

        btn_Mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mas_Off.png"))); // NOI18N
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
        contentBtns.add(btn_Mas);

        btn_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info_Off.png"))); // NOI18N
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
        contentBtns.add(btn_Info);

        add(contentBtns);

        panelInfo.setBackground(new java.awt.Color(5, 19, 36));
        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtInfo.setForeground(new java.awt.Color(255, 255, 255));
        txtInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelInfo.add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 120));

        imagenInfo.setBackground(new java.awt.Color(5, 19, 36));
        panelInfo.add(imagenInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 14, 420, 130));

        add(panelInfo);

        panelPreguntas.setBackground(new java.awt.Color(5, 19, 36));
        panelPreguntas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelPreguntas.add(imagenPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 210));

        add(panelPreguntas);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MasMouseClicked

        panelInfo.setVisible(infoVisible);
        panelPreguntas.setVisible(true);
        SetImageLabel(imagenPregunta, "src/imagenes/Panel_Principal.png");
        Pregunta preguntaPanel = new Pregunta();
        panelPreguntas.add(preguntaPanel);
        panelPreguntas.revalidate();
        panelPreguntas.repaint();
        

    }//GEN-LAST:event_btn_MasMouseClicked

    private void btn_MasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MasMouseEntered
        SetImageLabel(btn_Mas, "src/imagenes/Mas_On.png");
    }//GEN-LAST:event_btn_MasMouseEntered

    private void btn_MasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MasMouseExited
        SetImageLabel(btn_Mas, "src/imagenes/Mas_Off.png");
    }//GEN-LAST:event_btn_MasMouseExited

    private void btn_InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMouseClicked
        infoVisible = !infoVisible; 
        botonPresInfo = infoVisible;
        panelInfo.setVisible(infoVisible);

        String texto = "<html><div style='text-align:center;'>"
                 + "Añade las preguntas que quieras que aparezcan durante<br>"
                 + "la simulacion, luego pulsa el botón crear para exportar<br>"
                 + "el archivo zip que deberías subir a SharePoint</div></html>";

        if (infoVisible) {
            SetImageLabel(imagenInfo, "src/imagenes/Panel_Info.png");
            SetImageLabel(btn_Info, "src/imagenes/Info_On.png"); 
            txtInfo.setText(texto);
            txtInfo.setVisible(true); 
            imagenInfo.setVisible(true);
        } else {
            SetImageLabel(btn_Info, "src/imagenes/Info_Off.png"); 
            if (!botonPresInfo) { 
                imagenInfo.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_InfoMouseClicked

    private void btn_InfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMouseEntered
           if (!botonPresInfo) { 
                SetImageLabel(btn_Info, "src/imagenes/Info_On.png");
    }
    }//GEN-LAST:event_btn_InfoMouseEntered

    private void btn_InfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMouseExited
            if (!botonPresInfo) { 
                SetImageLabel(btn_Info, "src/imagenes/Info_Off.png");
    }

    }//GEN-LAST:event_btn_InfoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Info;
    private javax.swing.JLabel btn_Mas;
    private javax.swing.JPanel contentBtns;
    private javax.swing.JLabel imagenInfo;
    private javax.swing.JLabel imagenPregunta;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelPreguntas;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txtInfo;
    // End of variables declaration//GEN-END:variables
}
