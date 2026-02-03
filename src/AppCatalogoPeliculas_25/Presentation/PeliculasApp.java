package AppCatalogoPeliculas_25.Presentation;

import AppCatalogoPeliculas_25.Domain.Pelicula;
import AppCatalogoPeliculas_25.Service.IServicioPeliculas;
import AppCatalogoPeliculas_25.Service.ServicioPeliculasArchivo;

import java.util.Scanner;

public class PeliculasApp {

    private static final IServicioPeliculas servicioPeliculas = new ServicioPeliculasArchivo();

    public static void main(String[] args) {
        AppVista();
    }

    static void AppVista() {

        boolean isSalir = false;
        var teclado = new Scanner(System.in);
        int opcion = 0;
        while (!isSalir) {

            try {
                Menu();
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1 -> {
                        AgregarPelicula(teclado);
                    }
                    case 2 -> {
                        servicioPeliculas.ListarPeliculas();
                    }
                    case 3 -> {
                        BuscarPelicula(teclado);
                    }
                    case 4 -> {
                        isSalir = true;
                        System.out.println("Gracias, vuelva pronto...");
                    }
                    default -> {
                        System.out.println("Opcion no válida.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un numero.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    static void Menu() {
        String menu = """
                **** CATALOGO PELICULAS ***
                1. Agregar
                2. Listar
                3. Buscar 
                4. Salir
                
                Selecciona opción: 
                """;
        System.out.print(menu);
    }

    static void AgregarPelicula(Scanner teclado) {
        System.out.print("Ingrese el nombre de pelicula: ");
        var nombrePelicula = teclado.nextLine();
        var pelicula = new Pelicula(nombrePelicula);
        servicioPeliculas.AgregarPelicula(pelicula);
    }

    static void BuscarPelicula(Scanner teclado) {
        System.out.print("Nombre de pelicula a buscar: ");
        var nombrePelicula = teclado.nextLine();
        servicioPeliculas.buscarPelicula(new Pelicula(nombrePelicula));
    }

}
