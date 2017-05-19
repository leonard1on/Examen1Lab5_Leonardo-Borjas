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
public class ArchivoTexto extends Archivo{

    private String contenido;

    public ArchivoTexto() {
    }

    
    public ArchivoTexto(String contenido, String nombre, int tamano) {
        super(nombre, tamano);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.toString()+".at";
    }

    

    

   

}
