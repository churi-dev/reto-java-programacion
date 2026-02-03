package AppCatalogoPeliculas_25.Service;

import AppCatalogoPeliculas_25.Domain.Pelicula;

import java.io.*;

public class ServicioPeliculasArchivo implements IServicioPeliculas {

    private final String NOMBRE_ARCHIVO = "./src/AppCatalogoPeliculas_25/Pelicula_2025.txt";

    public ServicioPeliculasArchivo() {
        CrearArchivo(NOMBRE_ARCHIVO);
    }

    static void CrearArchivo(String nombreArchivo) {
        try  {
            var archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                System.out.println("Archivo ya está creado");
            } else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Archivo creado");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void ListarPeliculas() {
        // abrir archivo
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            System.out.println("Listado de Peliculas");
            var entrada = new BufferedReader(new FileReader(archivo));
            // leer lina a linea
            String linea;
            linea = entrada.readLine();
            // leemos toda linea
            while (linea != null) {
                var pelicula = new Pelicula(linea);
                System.out.println(pelicula);
                // antes de terminar ciclo, leemos siguiente
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void AgregarPelicula(Pelicula pelicula) {
        boolean anexar = false;
        // abrir archivo
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            // agregar pelicula
            salida.println(pelicula);
            salida.close();
            System.out.println("Se agregó la pelicula al archivo: " + pelicula);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void buscarPelicula(Pelicula pelicula) {
        var archivo = new File(NOMBRE_ARCHIVO);

        try {
            // abrimos para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea;
            linea = entrada.readLine();
            var indice = 1;
            var encontrada = false;
            var peliculaBuscar = pelicula.getNombre();
            while (linea != null) {
                // buscar sin mayus o minus
                if (peliculaBuscar != null && peliculaBuscar.equals(linea)) {
                    encontrada = true;
                    break;
                }
                // leemos siguiente linea
                linea = entrada.readLine();
                indice++;
            }

            // verificamos
            if (encontrada) {
                System.out.println("Pelicula encontrada: " + pelicula
                + " en linea " + indice);
            } else {
                System.out.println("Pelicula no encontrada: " + pelicula);
            }

            entrada.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
