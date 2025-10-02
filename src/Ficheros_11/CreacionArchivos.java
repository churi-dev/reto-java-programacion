package Ficheros_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreacionArchivos {
    public static void main(String[] args) {
        GenerarArchivo("churi-dev");
    }

    static void GenerarArchivo(String nombreArchivo) {
        String contenido = "Nombre: Jhon\nEdad: 22\nLenguaje de programación: Java";
        try (var archivoCreado = new FileWriter("./src/Ficheros_11/" + nombreArchivo + ".txt")) {
            archivoCreado.write(contenido);
            System.out.println("Archivo creado exitosamente!");
        } catch (IOException e) {
            System.out.println("No pudo crear el archivo.");
            e.printStackTrace();
        }

        // funcion leer
        LeerContenido(nombreArchivo);
    }

    static void LeerContenido(String nombreArchivo) {
        var ruta = new File("./src/Ficheros_11/" +nombreArchivo + ".txt");

        try (var archivo = new Scanner(ruta)) {
            while (archivo.hasNext()) {
                String data = archivo.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo.");
            e.printStackTrace();
        }

        // eliminar archivo
        //EliminarArchivo(nombreArchivo);
    }

    static void EliminarArchivo(String nombreArchivo) {
        var ruta = new File("./src/Ficheros_11/" +nombreArchivo + ".txt");
        if (ruta.delete()) {
            System.out.println("Archivo eliminado exitosamente!");
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }
    }
}
