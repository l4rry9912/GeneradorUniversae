/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LecturaCSV {
    
    public static void main(String[] args){
    ArrayList<CSV> al = new ArrayList<CSV>();
    CSV c;
    String [] datos;
    try (Scanner scFile = new Scanner(new File("src/Ahora/Preguntas.csv"))){
        while(scFile.hasNextLine()){
            datos = scFile.nextLine().split(";");
            c = new CSV(datos[0], datos[1], datos[2], datos[3], datos[4]);
            al.add(c);
        }
    }   catch (Exception e){
        System.out.println("Error");
        }
    
    for (CSV csv: al){
        System.out.println(csv);
        }
    }
    
}
