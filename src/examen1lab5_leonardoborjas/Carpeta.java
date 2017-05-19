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
public class Carpeta extends Archivo{

    public Carpeta() {
    }

    public Carpeta(String nombre, int tamano) {
        super(nombre, tamano);
    }

    @Override
    public String toString() {
        return "►"+super.toString();
    }
    
    
}
