/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class Trabajador {
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajador(String c, String n, String co, double s, String m) {
        cedula = c;
        nombres = n;
        correo = co;
        sueldo = s;
        mesSueldo = m;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerNombres(String c) {
        nombres = c;
    }

    public void establecerCorreo(String c) {
        correo = c;
    }

    public void establecerSueldo(double c) {
        sueldo = c;
    }

    public void establecerMesSueldo(String c) {
        mesSueldo = c;
    }
    
    
    
    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cedula: %s - Nombre: %s \n-"
                + " Correo: %s\nSueldo: %.2f - Mes del Sueldo: %s\n",
                obtenerCedula(),
                obtenerNombres(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo());
        return cadena;
    }
}
