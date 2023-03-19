/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmd;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Comandos {

    public static void crearCarpeta(String nombre) {
        File carpeta = new File(nombre);
        if (carpeta.mkdir()) {
            System.out.println("Carpeta creada");
        } else {
            System.out.println("No se pudo crear la carpeta");
        }
    }

    public static void eliminarCarpeta(String nombre) {
        File carpeta = new File(nombre);
        if (carpeta.delete()) {
            System.out.println("Carpeta eliminada");
        } else {
            System.out.println("No se pudo eliminar la carpeta");
        }
    }

    public static void cambiarCarpeta(String nombre) {
        File carpeta = new File(nombre);
        if (carpeta.exists() && carpeta.isDirectory()) {
            System.setProperty("user.dir", carpeta.getAbsolutePath());
        } else {
            System.out.println("No se pudo cambiar a la carpeta especificada");
        }
    }

    public static void volverCarpeta() {
        File carpeta = new File(System.getProperty("user.dir"));
        File padre = carpeta.getParentFile();
        if (padre != null) {
            System.setProperty("user.dir", padre.getAbsolutePath());
        } else {
            System.out.println("No se pudo volver a la carpeta anterior");
        }
    }

    public static void listarArchivos() {
        File carpeta = new File(System.getProperty("user.dir"));
        String[] archivos = carpeta.list();
        for (String archivo : archivos) {
            System.out.println(archivo);
        }
    }

    public static void mostrarFechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formato.format(fecha));
    }

    public static void mostrarHoraActual() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        System.out.println(formato.format(fecha));
    }

}
