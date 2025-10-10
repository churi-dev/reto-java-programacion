package PeticionesHttp_20;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticiones {

    static HttpClient cliente = HttpClient.newHttpClient();
    static final String URL_API_POKEMON = "https://pokeapi.co/api/v2/pokemon/";

    public static void main(String[] args) {
        ObtenerPokemon(1);
    }

    public static void ObtenerPokemon(int idPokemon) {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL_API_POKEMON + idPokemon))
                .GET()
                .build();

        try {
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JsonObject jsonPokemon = JsonParser.parseString(response.body()).getAsJsonObject();

                String nombre = jsonPokemon.get("name").getAsString();
                Double peso = jsonPokemon.get("weight").getAsDouble();
                double altura = jsonPokemon.get("height").getAsDouble();

                String mensaje = "Nombre: " + nombre + "\n" +
                        "Peso: " + peso + "\n"
                        + "Altura: " + altura + "\n";

                System.out.println(mensaje);

                // tipos
                JsonArray tiposArreglo = jsonPokemon.getAsJsonArray("types");

                for (int i = 0; i < tiposArreglo.size(); i++) {

                    // acceder al objeto dentro del arreglo
                    JsonObject tipoObjeto = tiposArreglo.get(i).getAsJsonObject();

                    // dentro de ese arreglo otro objeto
                    JsonObject tipoInterno = tipoObjeto.getAsJsonObject("type");

                    // acceder a su propiedad o campo nombre
                    String nombreTipo = tipoInterno.get("name").getAsString();

                    System.out.println("Tipo: " + nombreTipo);
                }

            } else if (response.statusCode() == 404) {
                System.out.println("No se encontro el pokemon");
            }

        } catch (IOException  | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al obtener el pokemon");
        }
    }
}
