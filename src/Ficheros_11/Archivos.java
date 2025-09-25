package Ficheros_11;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {
    public static void main(String[] args) {
        //EscribirContenidoSinReemplazar("archivo2.txt");
        //LeerArchivo("archivo2.txt");
        EliminarArchivo("archivo2.txt");
    }
    static void EliminarArchivo(String archivo) {
        var archivoFichero = new File("./src/Ficheros_11/" + archivo);

        if (archivoFichero.delete()) {
            System.out.println("El archivo se elimino con exito");
        } else {
            System.out.println("Archivo no encontrado.");
        }
    }
    static void LeerArchivo(String nombreArchivo) {
        var miArchivo = new File("./src/Ficheros_11/" + nombreArchivo);

        try (var fileReader = new Scanner(miArchivo)) {
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo");
            e.printStackTrace();
        }
    }

    static void EscribirContenidoSinReemplazar(String nombreArchivo) {
        try(var fileWriter = new FileWriter("./src/Ficheros_11/" + nombreArchivo, true)) {
            fileWriter.write("Valor 1");
            fileWriter.write("\nValor 3");
            System.out.println("Contenido agregado.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error escribir el archivo.");
            e.printStackTrace();
        }
    }

    // FileWriter => escribe contenido dentro del archivo pero reemplaza el valor
    static void TryResources() {
        try (var file = new FileWriter("./src/Ficheros_11/archivo1.txt")) {
            file.write("Ahora segunda linea");
            System.out.println("El archivo se ha creado con exito");
        } catch (IOException e) {
            System.out.println("Ocurrio un error al crear el archivo");
            e.printStackTrace();
        }
    }

    static void CrearArchivoVacio() {
        // createNewFile => valor => booleano
        // permite crear un archivo vacio o verificar si esta creado el archivo
        try {
            var file = new File("./src/Ficheros_11/archivo1.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
                System.out.println("Ruta absoluta: " + file.getAbsolutePath());
            } else {
                System.out.println("Archivo existente.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error al crear el archivo");
            e.printStackTrace();
        }
    }


}
