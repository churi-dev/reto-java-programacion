package PruebasUnitarias_13;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Pruebas {

    public  double Division(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre 0.");
        }
        return  numero1 / numero2;
    }

    public Map<String, String> DataInformacion() {

        var data = new HashMap<String, String>();
        data.put("name", "Jhon");
        data.put("age", "22");
        data.put("birth_date", "07-07-2003");
        data.put("programming_language", "Java, Javascript, Tyspecript");

        return data;
    }

}
