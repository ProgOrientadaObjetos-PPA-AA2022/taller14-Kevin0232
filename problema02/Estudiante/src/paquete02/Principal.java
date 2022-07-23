/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.*;

/**
 *
 * @author kevin
 */
public class Principal {
    public static void main(String[] args) {
        Enlace e = new Enlace();
        OperacionesEstudiante op = new OperacionesEstudiante(e.obtenerDataEstudiante());
        System.out.println(op);
    }
}
