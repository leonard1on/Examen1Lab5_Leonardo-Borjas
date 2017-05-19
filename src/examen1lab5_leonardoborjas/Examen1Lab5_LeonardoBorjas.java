/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab5_leonardoborjas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonardo Borjas
 */
public class Examen1Lab5_LeonardoBorjas {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;
        ArrayList<Usuario> usuarios = new ArrayList();
        do {
            System.out.println("*****MENU*****\n"
                    + "1. Registrar Usuario\n"
                    + "2. Modificar Usuario\n"
                    + "3. Eliminar Usuario\n"
                    + "4. Listar Usuarios\n"
                    + "5. Log in\n"
                    + "6. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    usuarios.add(usuario());
                    break;
                case 2:
                    usuarios = modusuario(usuarios);
                    break;
                case 3:
                    usuarios = removusuario(usuarios);
                    break;
                case 4:
                    for (Usuario usuario : usuarios) {
                        System.out.println(usuarios.indexOf(usuario) + " " + usuario);
                    }
                    break;
                case 5:
                    boolean entrar=login(usuarios);
                    if (entrar) {
                        System.out.println("si");
                    }else{
                        System.out.println("Usuario o Contraseña incorrecta");
                    }
                    break;
                default:
                    break;
            }
        } while (menu != 6);

    }

    public static Usuario usuario() {
        System.out.println("Cual es su nombre?");
        String nombre = sc.next();
        System.out.println("Cual es su edad?");
        int edad = sc.nextInt();
        System.out.println("Cual es su profesion?");
        String profesion = sc.next();
        System.out.println("Username?");
        String username = sc.next();
        System.out.println("Password?");
        String pass = sc.next();
        return new Usuario(nombre, edad, profesion, username, pass);
    }

    public static ArrayList<Usuario> modusuario(ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuarios.indexOf(usuario) + " " + usuario);
        }
        System.out.println("Cual usuario quiere modificar?");
        int espacio = sc.nextInt();
        if (espacio < usuarios.size()) {
            System.out.println("Cual es su nombre?");
            String nombre = sc.next();
            System.out.println("Cual es su edad?");
            int edad = sc.nextInt();
            System.out.println("Cual es su profesion?");
            String profesion = sc.next();
            System.out.println("Nuevo Username?");
            String username = sc.next();
            System.out.println("Nueva Password?");
            String pass = sc.next();

            usuarios.get(espacio).setNombre(nombre);
            usuarios.get(espacio).setEdad(edad);
            usuarios.get(espacio).setProfesion(profesion);
            usuarios.get(espacio).setUsername(username);
            usuarios.get(espacio).setPassword(pass);
        } else {
            System.out.println("Ese usuario no existe");
        }
        return usuarios;
    }

    public static ArrayList<Usuario> removusuario(ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuarios.indexOf(usuario) + " " + usuario);
        }
        System.out.println("Cual usuario quiere eliminar?");
        int espacio = sc.nextInt();
        if (espacio < usuarios.size()) {
            usuarios.remove(espacio);
        } else {
            System.out.println("Ese usuario no existe");
        }
        return usuarios;
    }

    public static boolean login(ArrayList<Usuario> usuarios) {
        boolean login = false;
        System.out.println("Ingrese Usuario");
        String usuario = sc.next();
        System.out.println("Ingrese Conraseña");
        String contra = sc.next();
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(usuario) && u.getPassword().equals(contra)) {
                System.out.println("Ingresado correctamente");
                login = true;
            }

        }

        return login;
    }
}
