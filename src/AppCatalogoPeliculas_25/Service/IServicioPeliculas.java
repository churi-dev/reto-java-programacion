package AppCatalogoPeliculas_25.Service;

import AppCatalogoPeliculas_25.Domain.Pelicula;

public interface IServicioPeliculas {

    void ListarPeliculas();

    void AgregarPelicula(Pelicula pelicula);

    void buscarPelicula(Pelicula pelicula);
}
