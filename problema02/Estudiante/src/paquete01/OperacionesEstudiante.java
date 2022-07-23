/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class OperacionesEstudiante {

    private ArrayList<Estudiante> lista = new ArrayList<>();
    private double promedio;

    public OperacionesEstudiante(ArrayList<Estudiante> e) {
        lista = e;
    }

    public void establecerLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    public void establecerPromedio(Estudiante e) {
        promedio = (e.obtenerCal1() + e.obtenerCal2() + e.obtenerCal3())/3;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < obtenerLista().size(); i++) {
            establecerPromedio(obtenerLista().get(i));
            cadena = String.format("%s%s\tPromedio: %.2f\n\n",
                    cadena,
                    obtenerLista().get(i),
                    obtenerPromedio());
        }
        return cadena;
    }
}
