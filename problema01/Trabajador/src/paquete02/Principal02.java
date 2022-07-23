/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Enlace;

/**
 *
 * @author kevin
 */
public class Principal02 {
    
    public static void main(String[] args) {
        
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
            System.out.printf("%s", c.obtenerDataTrabajador().get(i));
        } 
        
    }
}
