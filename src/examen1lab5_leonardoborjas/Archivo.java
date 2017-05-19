/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab5_leonardoborjas;

/**
 *
 * @author Leonardo Borjas
 */
public class Archivo {

    private String nombre;
    private int tamano;

    public Archivo() {
    }

    public Archivo(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Archivo" + nombre;
    }

}
