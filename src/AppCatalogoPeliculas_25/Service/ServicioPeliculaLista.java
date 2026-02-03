package AppCatalogoPeliculas_25.Service;

import AppCatalogoPeliculas_25.Domain.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculaLista implements IServicioPeliculas {

    private final List<Pelicula> peliculas;

    public ServicioPeliculaLista() {
        this.peliculas = new ArrayList<>();
    }

    public void ListarPeliculas() {
        System.out.println("Listando peliculas...");
        peliculas.forEach(System.out::println);
    }

    public void AgregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agregó la pelicula: " + pelicula.getNombre());
    }

    public void buscarPelicula(Pelicula pelicula) {
        // regresa indice de pelicula en la lista
        var indice = peliculas.indexOf(pelicula);
        if (indice == -1) {
            System.out.println("Pelicula no encontrada: " + pelicula);
        } else {
            System.out.println("Pelicula encontrada en el indice: " + indice);
        }

    }
}
