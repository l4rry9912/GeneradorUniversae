/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author L4rry
 */
public class Dialogo extends JDialog {

        public Dialogo(Frame parent, String mensaje, int width, int height, Color backgroundColor, Color textColor, int Tiempo) {
            super(parent, true);
            setUndecorated(true);
            JPanel contentPanel = new JPanel();
            contentPanel.setBackground(backgroundColor);
            contentPanel.setLayout(new BorderLayout());

            JLabel mensajeText = new JLabel(mensaje, SwingConstants.CENTER);
            mensajeText.setForeground(textColor); 
            contentPanel.add(mensajeText, BorderLayout.CENTER);

            getContentPane().add(contentPanel);
            setSize(width, height);
            setLocationRelativeTo(parent);
            
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    dispose();
                }
            }, Tiempo);
        }
}
