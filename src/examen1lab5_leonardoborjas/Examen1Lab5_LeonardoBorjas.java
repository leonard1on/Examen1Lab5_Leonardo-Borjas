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
    static String usuario;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;
        ArrayList<Usuario> usuarios = new ArrayList();
        ArrayList<Proyecto> proyectos = new ArrayList();
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
                    for (Usuario u : usuarios) {
                        System.out.println(usuarios.indexOf(u) + " " + u);
                    }
                    break;
                case 5:
                    boolean entrar = login(usuarios);
//-------------------------------------------------------Proyecto-----------------------                    
                    if (entrar) {
                        int menu2 = 0;
                        do {
                            for (Proyecto p : proyectos) {
                                System.out.println(proyectos.indexOf(p) + " " + p);
                            }
                            System.out.println("Bienvenido a Leohub\n"
                                    + "1. Crear Proyecto\n"
                                    + "2. Modificar Proyecto\n"
                                    + "3. Eliminar Proyecto\n"
                                    + "4. Log Out");
                            menu2 = sc.nextInt();
                            switch (menu2) {
                                case 1:
                                    proyectos.add(proyecto(usuarios));

                                    break;
                                case 2:
                                    boolean avanzar = false;
                                    System.out.println("A cual Proyecto desea entrar para modificarlo?");
                                    int espacio = sc.nextInt();
                                    if (espacio < proyectos.size()) {
                                        avanzar = true;
                                    }
//----------------------------------------------------------------------Archivos y Carpetas----------------------------------------                                    
                                    if (avanzar) {
                                        int menu3 = 0;

                                        do {
                                            System.out.println("*****" + proyectos.get(espacio) + "*****");
                                            for (Archivo a : proyectos.get(espacio).getArchivos()) {
                                                System.out.println(proyectos.get(espacio).getArchivos().indexOf(a) + " " + a);
                                            }

                                            System.out.println("\n1. Crear Archivo\n"
                                                    + "2. Modificar Archivo\n"
                                                    + "3. Eliminar Archivo\n"
                                                    + "4. Ingresar Comando\n"
                                                    + "5. Volver");
                                            menu3 = sc.nextInt();
                                            switch (menu3) {
                                                case 1:
                                                    System.out.println("Desea crear:\n"
                                                            + "1. Archivo de Texto\n"
                                                            + "2. Carpeta");
                                                    int opcion = sc.nextInt();
                                                    switch (opcion) {
                                                        case 1:
                                                            proyectos.get(espacio).getArchivos().add(archivotexto());

                                                            for (Usuario u : usuarios) {
                                                                if (u.getUsername().equals(usuario)) {
                                                                    if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                                    } else {
                                                                        proyectos.get(espacio).getColaboradores().add(u);
                                                                    }

                                                                }
                                                            }

                                                            break;
                                                        case 2:
                                                            proyectos.get(espacio).getArchivos().add(carpeta());
                                                            for (Usuario u : usuarios) {
                                                                if (u.getUsername().equals(usuario)) {
                                                                    if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                                    } else {
                                                                        proyectos.get(espacio).getColaboradores().add(u);
                                                                    }

                                                                }
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("Que archivo desea modificar");
                                                    int space = sc.nextInt();
                                                    if (space < proyectos.get(espacio).getArchivos().size()) {
                                                        if (proyectos.get(espacio).getArchivos().get(space) instanceof Carpeta) {
                                                            int menu4 = 0;
                                                            System.out.println("*****" + ((Carpeta) proyectos.get(espacio).getArchivos().get(space)) + "*****");
                                                            for (Archivo a : ((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos()) {
                                                                System.out.println(((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().indexOf(a) + " " + a);
                                                            }
                                                            System.out.println("\n1. Crear Archivo\n"
                                                                    + "2. Modificar Archivo\n"
                                                                    + "3. Eliminar Archivo\n"
                                                                    + "4. Ingresar Comando\n"
                                                                    + "5. Volver");
                                                            menu4 = sc.nextInt();
                                                            switch (menu4) {
                                                                case 1:
                                                                    System.out.println("Desea crear:\n"
                                                                            + "1. Archivo de Texto\n"
                                                                            + "2. Carpeta");
                                                                    opcion = sc.nextInt();
                                                                    switch (opcion) {
                                                                        case 1:
                                                                            ((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().add(archivotexto());

                                                                            for (Usuario u : usuarios) {
                                                                                if (u.getUsername().equals(usuario)) {
                                                                                    if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                                                    } else {
                                                                                        proyectos.get(espacio).getColaboradores().add(u);
                                                                                    }

                                                                                }
                                                                            }

                                                                            break;
                                                                        case 2:
                                                                            ((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().add(carpeta());
                                                                            for (Usuario u : usuarios) {
                                                                                if (u.getUsername().equals(usuario)) {
                                                                                    if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                                                    } else {
                                                                                        proyectos.get(espacio).getColaboradores().add(u);
                                                                                    }

                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                                case 2:
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                                    System.out.println("Que archivo desea modificar");
                                                    int e = sc.nextInt();
                                                    if (e < proyectos.get(e).getArchivos().size()) {
                                                        if (((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().get(e) instanceof Carpeta) {
                                                            int menu5 = 0;
                                                            System.out.println("*****" + ((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().get(e) + "*****");
                                                            for (Archivo a : ((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos()) {
                                                                System.out.println(((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().indexOf(a) + " " + a);
                                                            }
                                                            System.out.println("\n1. Crear Archivo\n"
                                                                    + "2. Eliminar Archivo\n"
                                                                    + "3. Ingresar Comando\n"
                                                                    + "4. Volver");
                                                            menu5 = sc.nextInt();
                                                            switch (menu5) {
                                                                case 1:
                                                                    System.out.println("Desea crear:\n"
                                                                            + "1. Archivo de Texto\n"
                                                                            + "2. Carpeta");
                                                                    opcion = sc.nextInt();
                                                                    switch (opcion) {
                                                                        case 1:
                                                                            ((Carpeta)((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().get(e)).getArchivos().add(archivotexto());

                                                                            for (Usuario u : usuarios) {
                                                                                if (u.getUsername().equals(usuario)) {
                                                                                    if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                                                    } else {
                                                                                        proyectos.get(espacio).getColaboradores().add(u);
                                                                                    }

                                                                                }
                                                                            }

                                                                            break;
                                                                        case 2:
                                                                            ((Carpeta)((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().get(e)).getArchivos().add(carpeta());
                                                                            for (Usuario u : usuarios) {
                                                                                if (u.getUsername().equals(usuario)) {
                                                                                    if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                                                    } else {
                                                                                        proyectos.get(espacio).getColaboradores().add(u);
                                                                                    }

                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    System.out.println("Cual archivo quiere eliminar?");
                                                                    e = sc.nextInt();
                                                                    if (space < ((Carpeta)((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().get(e)).getArchivos().size()) {
                                                                       ((Carpeta)((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().get(e)).getArchivos().remove(e);
                                                                    }

                                                                    for (Usuario u : usuarios) {
                                                                        if (u.getUsername().equals(usuario)) {
                                                                            if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                                            } else {
                                                                                proyectos.get(espacio).getColaboradores().add(u);
                                                                            }

                                                                        }
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Inserte comando de push (leo.push)");
                                                                    String push = sc.next();
                                                                    if ("leo.push".equals(push)) {
                                                                        for (Usuario u : proyectos.get(espacio).getColaboradores()) {
                                                                            if (u.getProyectos().contains(proyectos.get(espacio))) {

                                                                            } else {
                                                                                u.getProyectos().add(proyectos.get(espacio));
                                                                                proyectos.get(espacio).setCommits(proyectos.get(espacio).getCommits()+1);
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                default:    
                                                                    break;
                                                            }
                                                        }
                                                        if (((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().get(e)instanceof ArchivoTexto) {
                                                            ((ArchivoTexto)((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().get(e)).setContenido(modAT(((ArchivoTexto) proyectos.get(espacio).getArchivos().get(space)).getContenido()));
                                                        }
                                                    }

                                                    for (Usuario u : usuarios) {
                                                        if (u.getUsername().equals(usuario)) {
                                                            if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                            } else {
                                                                proyectos.get(espacio).getColaboradores().add(u);
                                                            }

                                                        }
                                                    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Cual archivo quiere eliminar?");
                                                                    space = sc.nextInt();
                                                                    if (space < ((Carpeta) proyectos.get(espacio).getArchivos().get(space)).getArchivos().size()) {
                                                                        proyectos.get(espacio).getArchivos().remove(space);
                                                                    }

                                                                    for (Usuario u : usuarios) {
                                                                        if (u.getUsername().equals(usuario)) {
                                                                            if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                                            } else {
                                                                                proyectos.get(espacio).getColaboradores().add(u);
                                                                            }

                                                                        }
                                                                    }
                                                                    break;
                                                                case 4:
                                                                    System.out.println("Inserte comando de push (leo.push)");
                                                                    String push = sc.next();
                                                                    if ("leo.push".equals(push)) {
                                                                        for (Usuario u : proyectos.get(espacio).getColaboradores()) {
                                                                            if (u.getProyectos().contains(proyectos.get(espacio))) {

                                                                            } else {
                                                                                u.getProyectos().add(proyectos.get(espacio));
                                                                                proyectos.get(espacio).setCommits(proyectos.get(espacio).getCommits()+1);
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        if (proyectos.get(espacio).getArchivos().get(space) instanceof ArchivoTexto) {
                                                            ((ArchivoTexto) proyectos.get(espacio).getArchivos().get(space)).setContenido(modAT(((ArchivoTexto) proyectos.get(espacio).getArchivos().get(space)).getContenido()));
                                                        }
                                                    }

                                                    for (Usuario u : usuarios) {
                                                        if (u.getUsername().equals(usuario)) {
                                                            if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                            } else {
                                                                proyectos.get(espacio).getColaboradores().add(u);
                                                            }

                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    System.out.println("Cual archivo quiere eliminar?");
                                                    space = sc.nextInt();
                                                    if (space < proyectos.get(espacio).getArchivos().size()) {
                                                        proyectos.get(espacio).getArchivos().remove(space);
                                                    }

                                                    for (Usuario u : usuarios) {
                                                        if (u.getUsername().equals(usuario)) {
                                                            if (proyectos.get(espacio).getColaboradores().contains(u)) {

                                                            } else {
                                                                proyectos.get(espacio).getColaboradores().add(u);
                                                            }

                                                        }
                                                    }
                                                    break;
                                                case 4:
                                                    System.out.println("Inserte comando de push (leo.push)");
                                                    String push = sc.next();
                                                    if ("leo.push".equals(push)) {
                                                        for (Usuario u : proyectos.get(espacio).getColaboradores()) {
                                                            if (u.getProyectos().contains(proyectos.get(espacio))) {

                                                            } else {
                                                                u.getProyectos().add(proyectos.get(espacio));
                                                                proyectos.get(espacio).setCommits(proyectos.get(espacio).getCommits()+1);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        } while (menu3 != 5);

                                    }
                                    break;
//---------------------------------------------------------------------------------------------------------------------------------                                    
                                case 3:
                                    proyectos = removproyecto(proyectos);
                                    break;
                                default:
                                    break;
                            }
                        } while (menu2 != 4);

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
        for (Usuario u : usuarios) {
            System.out.println(usuarios.indexOf(u) + " " + u);
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
        System.out.println("Ingrese Usuario");
        usuario = sc.next();
        System.out.println("Ingrese Conraseña");
        String contra = sc.next();
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(usuario) && u.getPassword().equals(contra)) {
                System.out.println("Ingresado Correctamente");
                return true;
            }
            if (!u.getUsername().equals(usuario)) {
                System.out.println("Usuario incorrecto");
            }
            if (!u.getPassword().equals(contra)) {
                System.out.println("Contraseña incorrecta");
            }

        }

        return false;
    }

    public static Proyecto proyecto(ArrayList<Usuario> usuarios) {
        System.out.println("Cual es el nombre de su proyecto?");
        String nombre = sc.next();
        Proyecto nuevo = new Proyecto(nombre);
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(usuario)) {
                nuevo.getColaboradores().add(u);
            }
        }

        return nuevo;
    }

    public static ArrayList<Proyecto> removproyecto(ArrayList<Proyecto> proyecto) {
        for (Proyecto p : proyecto) {
            System.out.println(proyecto.indexOf(p) + " " + p);
        }
        System.out.println("Cual Proyecto desea remover?");
        int espacio = sc.nextInt();
        if (espacio < proyecto.size()) {
            proyecto.remove(espacio);
        }
        return proyecto;
    }

    public static Archivo archivotexto() {
        System.out.println("Cual es el nombre del archivo?");
        String nombre = sc.next();
        System.out.println("Cual es el tamano del archivo?");
        int tamano = sc.nextInt();
        System.out.println("Ingrese el contenido del archivo");
        String contenido = sc.next();

        System.out.println();
        return new ArchivoTexto(contenido, nombre, tamano);
    }

    public static String modAT(String viejo) {
        char resp = 't';
        do {
            System.out.println(viejo);
            System.out.println("Que desea agregarle?");
            String nuevo = sc.next();
            viejo = viejo + " " + nuevo;
            System.out.println("Desea guardar? si=s, no=n");
        } while (resp != 's' || resp != 'n');

        return viejo;
    }

    public static Archivo carpeta() {
        System.out.println("Cual es el nombre del archivo");
        String nombre = sc.next();
        System.out.println("Cual es el tamano");
        int tamano = sc.nextInt();
        return new Carpeta(nombre, tamano);
    }
}
