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
        txtTitulo = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JLabel();
        txtDesplegable = new javax.swing.JLabel();
        desplegable = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Crea tu simulador ");
        bg.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 60));

        txtPregunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPregunta.setForeground(new java.awt.Color(255, 255, 255));
        txtPregunta.setText("Añadir una pregunta");
        bg.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        txtDesplegable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDesplegable.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(txtDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 330, 30));

        desplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Desplegable_Off.png"))); // NOI18N
        desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desplegableMouseClicked(evt);
            }
        });
        bg.add(desplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 390, 50));

        content.setBackground(new java.awt.Color(5, 19, 36));
        content.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 460, 760));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        Fondo.setText("jLabel1");
        bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 940));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desplegableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplegableMouseClicked
        
        String imagenOff = ("src/imagenes/Desplegable_Off.png");
        String imagenOn = ("src/imagenes/Desplegable_On.png");
        setImageLabel(desplegable, imagenOn);
        
    if (!menuDesplegado) {
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setPreferredSize(new Dimension(390, 150));

        JMenuItem opcion1 = new JMenuItem("Ahora aprendo");
        JMenuItem opcion2 = new JMenuItem("Atrapa los univercoins");
        JMenuItem opcion3 = new JMenuItem("BAAM");
        JMenuItem opcion4 = new JMenuItem("Pienso palabra");

        opcion1.addActionListener(e -> {
            txtDesplegable.setText(opcion1.getText());  
            setImageLabel(desplegable, imagenOff);
            menuDesplegado = false;
        });
        opcion2.addActionListener(e -> {
            txtDesplegable.setText(opcion2.getText());
            setImageLabel(desplegable, imagenOff);
            menuDesplegado = false;
 
        });
        opcion3.addActionListener(e -> {
            txtDesplegable.setText(opcion3.getText());
            setImageLabel(desplegable, imagenOff);
            menuDesplegado = false;

        });
        opcion4.addActionListener(e -> {
            txtDesplegable.setText(opcion4.getText());
            setImageLabel(desplegable, imagenOff);
            menuDesplegado = false;

        });
        popupMenu.add(opcion1);
        popupMenu.add(opcion2);
        popupMenu.add(opcion3);
        popupMenu.add(opcion4);

        popupMenu.show(desplegable, 0, desplegable.getHeight());
        
        menuDesplegado = true;
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!desplegable.getBounds().contains(e.getPoint())) {
                    setImageLabel(desplegable, imagenOff);
                    popupMenu.setVisible(false);
                    menuDesplegado = false;
                }
            }
        });
    } else {
        setImageLabel(desplegable, imagenOff);
        menuDesplegado = false; 
    }
    }//GEN-LAST:event_desplegableMouseClicked

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
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JLabel desplegable;
    private javax.swing.JLabel txtDesplegable;
    private javax.swing.JLabel txtPregunta;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
