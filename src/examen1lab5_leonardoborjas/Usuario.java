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
public class Usuario {
    private String nombre;
    private int edad;
    private String profesion;
    private String username;
    private String password;
    private ArrayList<Proyecto> proyectos=new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String profesion, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + ", username=" + username + ", password=" + password + ", proyectos=" + proyectos + '}';
    }
    

    
    
    
    
}
