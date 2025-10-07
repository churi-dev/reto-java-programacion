package JsonXml_12;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class ArchivosJson {
    public static void main(String[] args) {

        JSONObject file = new JSONObject();

        // agregar propiedades
        file.put("Nombre", "Jhon");
        file.put("Apellido", "Jhon");
        file.put("Correo", "churi@gmail.com");

        // mostrar el dato
        System.out.println(file);

        // primero convertir nuestro valor string JSON a un OBJETO JSON
        String valorJson = "{\"Nombre\":\"Jhon\",\"Correo\":\"churi@gmail.com\",\"Apellido\":\"Jhon\"}";
        Object archivo = JSONValue.parse(valorJson);

        // usamos la clase JSONObject para crear un objeto
        JSONObject jsonParseado = (JSONObject) archivo;

        // decodificamos para objener valor
        String nombre = (String)jsonParseado.get("Nombre");
        String apellido = (String)jsonParseado.get("Apellido");
        String correo = (String)jsonParseado.get("Correo");
        System.out.println(nombre + " " + apellido + " " + correo);

    }
}
