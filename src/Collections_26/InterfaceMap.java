package Collections_26;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterfaceMap {
    public static void main(String[] args) {
        MostrarLogSegunTamanio();
    }

    private static void log(Map<Long, String> map) {
        /*
        String message;
        if (map.size() > 1) {
            message = "Too many objects";
        } else if (map.size() == 1) {
            message = "Something in the map";
        } else {
            message = "There are no objects";
        }
         */
        int size = map.keySet().size();
        System.out.println(size);
        Map<Integer, String> message = Map.of(
                0, "There are no objects",
                1, "Something in the map",
                2, "Too many objects"
        );
        System.out.println(message.get(size > 1 ? 2 : size));
    }

    static void MostrarLogSegunTamanio() {
        String valueBase = "value-";
        Scanner scanner = new Scanner(System.in);

        Map<Long, String> m = new HashMap<>();

        long size = scanner.nextLong();

        for (long i = 0; i < size; ++i) {
            Long key = i;
            String value = valueBase + i;
            m.put(key, value);
        }
        log(Map.copyOf(m));
    }

    private static int getOrMin(Map<String, Integer> map, String key) {

        /*
        Integer valuReal;
        int min = Integer.MAX_VALUE;

        if (map.containsKey(key)) {
            valuReal = map.get(key);
        } else {
            for (Integer value :  map.values()) {
                if (value < min) {
                    min = value;
                }
            }
            valuReal = min;
        }
         */

        // no duerme, el que hizo esta solucion
        // map.getOrDefault(key, Collections.min(map.values()));

        return map.containsKey(key) ? map.get(key) : Collections.min(map.values());
    }

    static void ObtenerValorMinino() {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> m = new HashMap<>();
        int size = scanner.nextInt();

        for (int i = 0; i < size; ++i) {
            String key = scanner.next();
            int value = scanner.nextInt();
            m.put(key, value);
        }
        String key = scanner.next();
        int result = getOrMin(Map.copyOf(m), key);

        System.out.println(result);
    }

    private static Map<String, Integer> createStatuses() {
        Map<String, Integer> statusCode = Map.of(
                "SUCCESS", 0,
                "FAIL", 1,
                "WARN", 2
        );

        return statusCode;
    }

    static void CodigoEstadoMap() {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = createStatuses();

        String status = scanner.next();
        int result = map.getOrDefault(status, -1);

        System.out.println(result);
    }

    static void EjemploMap() {
        Map<String, Integer> map = Map.of(
                "Alice", 1,
                "Bob", 2
        );
        int result = map.getOrDefault("Bob", 3)
                + map.getOrDefault("John", 3);
        System.out.println(result);
    }

    private static int sum(Map<String, Integer> map) {

        int sum = 0;

        var valor = map.values();

        for (Integer numbers : valor) {
            sum += numbers;
        }

        return sum;
    }

    static void SumaNumerosMap() {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> m = new HashMap<>();

        int size = scanner.nextInt();

        for (int i = 0; i < size; ++i) {
            String key = scanner.next();
            int value = scanner.nextInt();
            m.put(key, value);
        }
        int result = sum(Map.copyOf(m));
        //System.out.println(result);
    }

    static void MapInterface() {
        // mapas es un collecion que guarda valores de clave-valor
        // inicializar valores inmutables
        Map<Integer, String> numeros = Map.of(
                1, "Jhon",
                2, "Dev",
                3, "Churi"
                );

        // HashMap
        Map<Integer, String> nombres = new HashMap<>();

        nombres.put(1, "Valor1");
        nombres.put(2, "Valor2");

        // devolver solo valores
        System.out.println(nombres.values());

        // deolver solo llaves
        System.out.println(nombres.keySet());
    }

}
