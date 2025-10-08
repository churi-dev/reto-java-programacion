package PruebasUnitarias_13;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Map;

public class TestUnits {

    private static Pruebas division = new Pruebas();

    // inicialiar el mapa instanciada con los datos completos
    Map<String, String> valoresInformacion = division.DataInformacion();

    @Test
    public void Division() {

        double valor = division.Division(10, 2);

        // assert: verificar el resultado esperado
        Assertions.assertEquals(5, valor, "Division debe ser 5");
    }

    // Un primero que determine que existen todos los campos
    @Test
    public void testKeyExists() {
        Assertions.assertEquals(4, valoresInformacion.size());
        Assertions.assertTrue(valoresInformacion.containsKey("name"));
        Assertions.assertTrue(valoresInformacion.containsKey("age"));
        Assertions.assertTrue(valoresInformacion.containsKey("birth_date"));
        Assertions.assertTrue(valoresInformacion.containsKey("programming_language"));
    }

    // Un segundo que determine que los datos introducidos son correctos
    @Test
    public void testValueExists() {
        Assertions.assertEquals(4, valoresInformacion.size());
        Assertions.assertEquals("Jhon", valoresInformacion.get("name"));
        Assertions.assertEquals("22", valoresInformacion.get("age"));
        Assertions.assertEquals("07-07-2003", valoresInformacion.get("birth_date"));
        Assertions.assertEquals("Java, Javascript, Tyspecript", valoresInformacion.get("programming_language"));
    }


}
