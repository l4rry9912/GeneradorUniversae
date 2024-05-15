/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author L4rry
 */
public class GeneradorBase extends javax.swing.JFrame {
    
    boolean menuDesplegado = false;
    
   

    public GeneradorBase() {
        initComponents();
        this.setLocationRelativeTo(this);
        Simulador1 simulador1 = CreateSimulador(0, this);
        PaintSimulador(simulador1);
        setImageLabel(desplegable, "src/imagenes/Desplegable_Off.png");
        panelDesplegable.setVisible(false);
    }
   
    public Simulador1 CreateSimulador (int index, GeneradorBase generadorBase){
        Simulador1 simulador1 = new Simulador1();
        simulador1.setSize(460, 760);
        simulador1.setLocation(0, 0);
        simulador1.parent = generadorBase;
        simulador1.indiceGradoActual = index;
        return simulador1;
    }
     public void PaintSimulador(JComponent component) {
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        content.removeAll();
        content.add(component, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
}
    
   
  
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtDesplegable = new javax.swing.JLabel();
        desplegable = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JLabel();
        panelDesplegable = new javax.swing.JPanel();
        Ahora = new javax.swing.JLabel();
        Cazador = new javax.swing.JLabel();
        Atrapa = new javax.swing.JLabel();
        BAAM = new javax.swing.JLabel();
        Pienso = new javax.swing.JLabel();
        imagenDesplegable = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(5, 19, 36));
        bg.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelTitulo.setBackground(new java.awt.Color(5, 19, 36));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Raleway", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Crea tu simulador ");
        panelTitulo.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        txtDesplegable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDesplegable.setForeground(new java.awt.Color(255, 255, 255));
        txtDesplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelTitulo.add(txtDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 350, 30));

        desplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Desplegable_Off.png"))); // NOI18N
        desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desplegableMouseClicked(evt);
            }
        });
        panelTitulo.add(desplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 390, 50));

        txtPregunta.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtPregunta.setForeground(new java.awt.Color(255, 255, 255));
        txtPregunta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPregunta.setText("Tipo de simulador");
        panelTitulo.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        bg.add(panelTitulo);

        panelDesplegable.setBackground(new java.awt.Color(5, 19, 36));
        panelDesplegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ahora.setBackground(new java.awt.Color(255, 255, 255));
        Ahora.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Ahora.setForeground(new java.awt.Color(255, 255, 255));
        Ahora.setText("   Ahora Aprendo");
        Ahora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ahora.setPreferredSize(new java.awt.Dimension(390, 18));
        Ahora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AhoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AhoraMouseExited(evt);
            }
        });
        panelDesplegable.add(Ahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        Cazador.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Cazador.setForeground(new java.awt.Color(255, 255, 255));
        Cazador.setText("   El Cazador");
        Cazador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cazador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CazadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CazadorMouseExited(evt);
            }
        });
        panelDesplegable.add(Cazador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 370, 30));

        Atrapa.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Atrapa.setForeground(new java.awt.Color(255, 255, 255));
        Atrapa.setText("   Atrapa los Univercoins");
        Atrapa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atrapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrapaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrapaMouseExited(evt);
            }
        });
        panelDesplegable.add(Atrapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 370, 30));

        BAAM.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        BAAM.setForeground(new java.awt.Color(255, 255, 255));
        BAAM.setText("   BAAM");
        BAAM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BAAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BAAMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BAAMMouseExited(evt);
            }
        });
        panelDesplegable.add(BAAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 370, 30));

        Pienso.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Pienso.setForeground(new java.awt.Color(255, 255, 255));
        Pienso.setText("   Pienso Palabra");
        Pienso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pienso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PiensoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PiensoMouseExited(evt);
            }
        });
        panelDesplegable.add(Pienso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 370, 30));
        panelDesplegable.add(imagenDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 386, 150));

        bg.add(panelDesplegable);

        content.setBackground(new java.awt.Color(5, 19, 36));
        content.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        bg.add(content);

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 981));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desplegableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplegableMouseClicked
        menuDesplegado = !menuDesplegado; 

        panelDesplegable.setVisible(menuDesplegado);

        if (menuDesplegado) {
            setImageLabel(desplegable, "src/imagenes/Desplegable_On.png");
            setImageLabel(imagenDesplegable, "src/imagenes/Panel_Principal.png");  
            imagenDesplegable.setVisible(true);
        } else {
            setImageLabel(desplegable, "src/imagenes/Desplegable_Off.png");
        }
    }//GEN-LAST:event_desplegableMouseClicked

    private void AhoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AhoraMouseEntered
        Ahora.setForeground(new Color(105,255,255));
    }//GEN-LAST:event_AhoraMouseEntered

    private void CazadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CazadorMouseEntered
        Cazador.setForeground(new Color(105,255,255));
    }//GEN-LAST:event_CazadorMouseEntered

    private void AtrapaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrapaMouseEntered
        Atrapa.setForeground(new Color(105,255,255));
    }//GEN-LAST:event_AtrapaMouseEntered

    private void BAAMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAAMMouseEntered
        BAAM.setForeground(new Color(105,255,255));
    }//GEN-LAST:event_BAAMMouseEntered

    private void PiensoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiensoMouseEntered
        Pienso.setForeground(new Color(105,255,255));
    }//GEN-LAST:event_PiensoMouseEntered

    private void AhoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AhoraMouseExited
        Ahora.setForeground(Color.white);
    }//GEN-LAST:event_AhoraMouseExited

    private void CazadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CazadorMouseExited
        Cazador.setForeground(Color.white);
    }//GEN-LAST:event_CazadorMouseExited

    private void AtrapaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrapaMouseExited
        Atrapa.setForeground(Color.white);
    }//GEN-LAST:event_AtrapaMouseExited

    private void BAAMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAAMMouseExited
        BAAM.setForeground(Color.white);
    }//GEN-LAST:event_BAAMMouseExited

    private void PiensoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiensoMouseExited
        Pienso.setForeground(Color.white);
    }//GEN-LAST:event_PiensoMouseExited

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
            java.util.logging.Logger.getLogger(GeneradorBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneradorBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneradorBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneradorBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneradorBase().setVisible(true);
            }
        }); 
    }
        private void setImageLabel(JLabel labelName, String root){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon ( image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
            labelName.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ahora;
    private javax.swing.JLabel Atrapa;
    private javax.swing.JLabel BAAM;
    private javax.swing.JLabel Cazador;
    private javax.swing.JLabel Pienso;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JLabel desplegable;
    private javax.swing.JLabel imagenDesplegable;
    private javax.swing.JPanel panelDesplegable;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel txtDesplegable;
    private javax.swing.JLabel txtPregunta;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
