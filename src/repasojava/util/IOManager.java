/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasojava.util;

import java.util.Scanner;

/**
 *
 * @author mfernandez
 */
public class IOManager {
    
    public static int leerEnteroPositivo(String msg){
          Scanner sc = new Scanner(System.in);
              int entero;
              do {
                  System.out.print(msg);
                  while (!sc.hasNextInt()) {
                         System.out.println("Ha ocurrido una excepción. Solo se permiten enteros");
                         sc.next();
                         System.out.print(msg);                               
                  }
                  entero = sc.nextInt();
                  if(entero <= 0){
                     System.out.println("El número debe ser positivo");                                           
                  }
              } while (entero <= 0);
             return entero;
    }
}
