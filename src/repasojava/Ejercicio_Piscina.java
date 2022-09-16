/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasojava;

import repasojava.model.Piscina;
import repasojava.util.IOManager;

/**
 *
 * @author mfernandez
 */
public class Ejercicio_Piscina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int long_vaso = 0;
        int ancho_vaso = 0;
        int long_parcela = 0;
        int ancho_parcela = 0;
        Piscina piscina;
        int aforo = 0;

        long_vaso = IOManager.leerEnteroPositivo("Introduzca longitud de la piscina: ");
        ancho_vaso = IOManager.leerEnteroPositivo("Introduzca anchura de la piscina: ");
        long_parcela = IOManager.leerEnteroPositivo("Introduzca longitud de la parcela: ");
        ancho_parcela = IOManager.leerEnteroPositivo("Introduzca anchura de la parcela: ");

        piscina = new Piscina(long_vaso, long_parcela, ancho_vaso, ancho_parcela);
        aforo = piscina.getAforo();

        System.out.println("El aforo de la piscina es: " + aforo + " personas");
    }

}
