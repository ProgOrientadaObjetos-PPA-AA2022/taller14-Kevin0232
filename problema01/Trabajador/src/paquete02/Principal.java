/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;
import paquete01.Enlace;
import paquete01.Trabajador;

/**
 *
 * @author SALA I
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        int opc =0;
        Trabajador t;
        String nombre;
        String cedula;
        String correo;
        double sueldo;
        String mesSueldo;
        Enlace c = new Enlace();
        do{
            System.out.println("***Ingrese los datos del trabajador***");
            System.out.print("Ingrese la cedula: ");
            cedula = leer.nextLine();
            System.out.println("");
            
            System.out.print("Ingrese la nombre: ");
            nombre = leer.nextLine();
            System.out.println("");
            
            System.out.print("Ingrese el correo: ");
            correo = leer.nextLine();
            System.out.println("");
            
            System.out.print("Ingrese el sueldo: ");
            sueldo = leer.nextDouble();
            System.out.println("");
            
            leer.nextLine();
            System.out.print("Ingrese el mes: ");
            mesSueldo = leer.nextLine();
            System.out.println("");
            
            t = new Trabajador(cedula, nombre, correo, sueldo, mesSueldo);
            System.out.println(t);
            c.insertarTrabajador(t);
            
            System.out.println("*** Desea ingresar un nuevo trabajador?");
            System.out.println("Si [1] ----- No [0]");
            opc = leer.nextInt();
            
            leer.nextLine();
        }while(opc != 0);
        
        System.out.println("--- ha salido del programa ----");
    }
}
