/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
/**
 *
 * @author L4rry
 */
public class GeneradorBase extends javax.swing.JFrame {
    
    boolean menuDesplegado = false;
    Simulador1 simulador1;
    public static GeneradorBase generador;
    public ArrayList<Pregunta> listaPreguntas = new ArrayList<>();
    
    public GeneradorBase() {
        initComponents();
        generador = this;
        this.setLocationRelativeTo(this);
        simulador1 = CreateSimulador(0, this);
        PaintSimulador(simulador1);
        setImageLabel(imagenBtn, "src/imagenes/Cilindrico_Off.png");
        setImageLabel(desplegable, "src/imagenes/Desplegable_Off.png");
        panelDesplegable.setVisible(false);
    }
    private void addLabelActionListener(JLabel label, String ruta) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                intercambiarTextoYColor(label);
                actualizarVistaContent();
                 String ruta = obtenerRutaSeleccionada();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (!label.getText().equals(Ahora.getText())) {
                    label.setForeground(Color.WHITE);
                    label.setBackground(null);
                }
            }
        });
    }
        private void intercambiarTextoYColor(JLabel label) {
        String selectedLabelText = label.getText();
        Color selectedLabelBackground = label.getBackground();

        String mainLabelText = Ahora.getText();
        Color mainLabelBackground = Ahora.getBackground();

        Ahora.setText(selectedLabelText);
        Ahora.setBackground(selectedLabelBackground);

        label.setText(mainLabelText);
        label.setBackground(mainLabelBackground);

        panelDesplegable.setVisible(false);
        menuDesplegado = false;
        Ahora.setPreferredSize(new Dimension(Ahora.getWidth(), Ahora.getHeight()));
        setImageLabel(desplegable, "src/imagenes/Desplegable_Off.png");
        panelTitulo.revalidate();
        panelTitulo.repaint();
    }
        private void actualizarVistaContent() {
        Simulador1 nuevoSimulador = CreateSimulador(0, GeneradorBase.this);
        PaintSimulador(nuevoSimulador);
    }
    public String obtenerRutaSeleccionada() {
        String labelText = Ahora.getText().trim();
        switch (labelText) {
            case "Ahora Aprendo":
                return "src/Ahora/Preguntas.csv";
            case "Atrapa los Univercoins":
                return "src/Atrapa/Preguntas.csv";
            case "BAAM":
                return "src/BAAM/Preguntas.csv";
            case "El Cazador":
                return "src/Cazador/Preguntas.csv";
            case "Pienso Palabra":
                return "src/Pienso/Preguntas.csv";
            default:
                return "src/Ahora/Preguntas.csv";
        }
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
     
    public void actualizarEstadoBoton() {
        
        if (simulador1.listaPreguntas.size() > 0) {
            imagenBtn.setEnabled(true); 
            setImageLabel(imagenBtn, "src/imagenes/Cilindrico_On.png");
            txtBtn.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
            txtNohayPre.setVisible(false);
        } else {
            imagenBtn.setEnabled(false); 
            setImageLabel(imagenBtn, "src/imagenes/Cilindrico_Off.png");
            txtBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            txtNohayPre.setVisible(true);
    }
}
    // Método para comprimir un directorio en un archivo ZIP
    public static void zipFolder(String sourceFolder, String zipFilePath) throws IOException {
        FileOutputStream fos = new FileOutputStream(zipFilePath);
        ZipOutputStream zos = new ZipOutputStream(fos);

        File folder = new File(sourceFolder);
        zipFile(folder, folder.getName(), zos);
        zos.close();
        fos.close();
    }
    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zos) throws IOException {
        if (fileToZip.isHidden()) {
            return;
        }
        if (fileToZip.isDirectory()) {
            if (fileName.endsWith("/")) {
                zos.putNextEntry(new ZipEntry(fileName));
                zos.closeEntry();
            } else {
                zos.putNextEntry(new ZipEntry(fileName + "/"));
                zos.closeEntry();
            }
            File[] children = fileToZip.listFiles();
            for (File childFile : children) {
                zipFile(childFile, fileName + "/" + childFile.getName(), zos);
            }
            return;
        }
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zos.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }
        fis.close();
    }
    

     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        Ahora = new javax.swing.JLabel();
        desplegable = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JLabel();
        panelDesplegable = new javax.swing.JPanel();
        Cazador = new javax.swing.JLabel();
        Atrapa = new javax.swing.JLabel();
        BAAM = new javax.swing.JLabel();
        Pienso = new javax.swing.JLabel();
        imagenDesplegable = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBtn = new javax.swing.JLabel();
        imagenBtn = new javax.swing.JLabel();
        txtNohayPre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(5, 19, 36));
        bg.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelTitulo.setBackground(new java.awt.Color(5, 19, 36));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Raleway", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Crea tu simulador ");
        panelTitulo.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        Ahora.setBackground(new java.awt.Color(255, 255, 255));
        Ahora.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Ahora.setForeground(new java.awt.Color(255, 255, 255));
        Ahora.setText("   Ahora Aprendo");
        Ahora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ahora.setPreferredSize(new java.awt.Dimension(390, 18));
        Ahora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AhoraMouseClicked(evt);
            }
        });
        panelTitulo.add(Ahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        desplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Desplegable_Off.png"))); // NOI18N
        desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desplegableMouseClicked(evt);
            }
        });
        panelTitulo.add(desplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 390, 50));

        txtPregunta.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtPregunta.setForeground(new java.awt.Color(255, 255, 255));
        txtPregunta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPregunta.setText("Tipo de simulador");
        panelTitulo.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        panelDesplegable.setBackground(new java.awt.Color(5, 19, 36));
        panelDesplegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cazador.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Cazador.setForeground(new java.awt.Color(255, 255, 255));
        Cazador.setText("   El Cazador");
        Cazador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cazador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CazadorMouseClicked(evt);
            }
        });
        panelDesplegable.add(Cazador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 30));

        Atrapa.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Atrapa.setForeground(new java.awt.Color(255, 255, 255));
        Atrapa.setText("   Atrapa los Univercoins");
        Atrapa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atrapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrapaMouseClicked(evt);
            }
        });
        panelDesplegable.add(Atrapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 300, 30));

        BAAM.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        BAAM.setForeground(new java.awt.Color(255, 255, 255));
        BAAM.setText("   BAAM");
        BAAM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BAAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAAMMouseClicked(evt);
            }
        });
        panelDesplegable.add(BAAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 300, 30));

        Pienso.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Pienso.setForeground(new java.awt.Color(255, 255, 255));
        Pienso.setText("   Pienso Palabra");
        Pienso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pienso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PiensoMouseClicked(evt);
            }
        });
        panelDesplegable.add(Pienso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 300, 30));
        panelDesplegable.add(imagenDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 150));

        content.setBackground(new java.awt.Color(5, 19, 36));
        content.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(5, 19, 36));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBtn.setForeground(new java.awt.Color(5, 19, 36));
        txtBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBtn.setText("Crear");
        txtBtn.setToolTipText("");
        txtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBtnMouseClicked(evt);
            }
        });
        jPanel2.add(txtBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -4, 470, 50));
        jPanel2.add(imagenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 0, 392, 42));

        txtNohayPre.setForeground(new java.awt.Color(255, 153, 0));
        txtNohayPre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNohayPre.setText("El simulador no tiene preguntas");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panelDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtNohayPre, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNohayPre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void txtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBtnMouseClicked

    boolean camposNoVacios = Pregunta.miPregunta.verificarCampos();

        if (camposNoVacios) {
            try {
                Pregunta.miPregunta.guardarEnCSV();
                // Obtener la ruta seleccionada en el desplegable
                String sourceFolder = obtenerRutaSeleccionada();

                // Definir la ruta y nombre del archivo ZIP de salida
                String zipFilePath = "C:/Users/L4rry/Desktop/" + Ahora.getText().trim() + ".zip";

                // Llamar al método para comprimir la carpeta seleccionada
                zipFolder(sourceFolder, zipFilePath);
               
               simulador1.eliminarTodasLasPreguntas();
            

                System.out.println("Directorio comprimido y guardado como " + zipFilePath);

                Frame parentFrame = (Frame) SwingUtilities.getWindowAncestor(this);
                Dialogo dialog = new Dialogo(parentFrame, "Preguntas guardadas correctamente" + simulador1.listaPreguntas.size(), 350, 50, Color.green, Color.black, 3000);
                dialog.setVisible(true);
      
            } catch (IOException ex) {
                Frame parentFrame = (Frame) SwingUtilities.getWindowAncestor(this);
                Dialogo dialog = new Dialogo(parentFrame, "Error al guardar las preguntas", 350, 50, Color.RED, Color.WHITE, 3000);
                dialog.setVisible(true);
                ex.printStackTrace();
            }
        } else {
            
        }
       
    }//GEN-LAST:event_txtBtnMouseClicked

    private void CazadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CazadorMouseClicked
        intercambiarTextoYColor(Cazador);
        actualizarVistaContent();
    }//GEN-LAST:event_CazadorMouseClicked

    private void AtrapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrapaMouseClicked
        intercambiarTextoYColor(Atrapa);
        actualizarVistaContent();
    }//GEN-LAST:event_AtrapaMouseClicked

    private void BAAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAAMMouseClicked
        intercambiarTextoYColor(BAAM);
        actualizarVistaContent();
    }//GEN-LAST:event_BAAMMouseClicked

    private void PiensoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiensoMouseClicked
        intercambiarTextoYColor(Pienso);
        actualizarVistaContent();
    }//GEN-LAST:event_PiensoMouseClicked

    private void AhoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AhoraMouseClicked
        intercambiarTextoYColor(Ahora);
        actualizarVistaContent();
    }//GEN-LAST:event_AhoraMouseClicked

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
    public javax.swing.JLabel Ahora;
    private javax.swing.JLabel Atrapa;
    private javax.swing.JLabel BAAM;
    private javax.swing.JLabel Cazador;
    private javax.swing.JLabel Pienso;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JLabel desplegable;
    private javax.swing.JLabel imagenBtn;
    private javax.swing.JLabel imagenDesplegable;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelDesplegable;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel txtBtn;
    private javax.swing.JLabel txtNohayPre;
    private javax.swing.JLabel txtPregunta;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
