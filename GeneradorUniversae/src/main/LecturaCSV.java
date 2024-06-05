/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LecturaCSV {
    
    public static int lineas;
    
    public static ArrayList<CSV> gcsv;    

    public static void LeerCSV(String ruta) {
    
        ArrayList<CSV> al = new ArrayList<>();
    
        CSV c;
    
        String[] datos;
        try (Scanner scFile = new Scanner(new File(ruta))) {
            
            while (scFile.hasNextLine()) {
                datos = scFile.nextLine().split(";");
                c = new CSV(datos[0], datos[1], datos[2], datos[3], datos[4]);
                al.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

        for (CSV csv : al) {
            
        }
        gcsv = al;
        
    }
    
}

