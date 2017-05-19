/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab5_leonardoborjas;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Carpeta extends Archivo{
ArrayList<Archivo> archivos=new ArrayList();
    public Carpeta() {
    }

    public Carpeta(String nombre, int tamano) {
        super(nombre, tamano);
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "►"+super.toString();
    }
    
    
}
