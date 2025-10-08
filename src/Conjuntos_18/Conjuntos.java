package Conjuntos_18;

import java.util.LinkedList;
import java.util.List;

public class Conjuntos {
    public static void main(String[] args) {

        List<String> conjunto = new LinkedList<>();

        // añadir elemento al final
        conjunto.add("Jhon");
        conjunto.add("July");

        // agregar elemento en posicion
        conjunto.add(0, "Dev");

        // añadir elementos en bloque
        List<String> nombres = new LinkedList<>();
        nombres.add("Luisina");
        nombres.add("Pedro");
        nombres.add("Luis");

        conjunto.addAll(nombres);

        System.out.println(conjunto);
    }
}
