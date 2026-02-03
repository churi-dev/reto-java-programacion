package StreamApi_26;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamInitial {

    // Stream API nos facilita la procesacion de objetos | Simplificar el uso de bucles complejos
    public static void main(String[] args) {
    }

    /*
    Implemente un método que imprima elementos ordenados de un flujo determinado de cadenas.
     */
    private static void app03Stream() {
        Scanner scanner = new Scanner(System.in);
        sortAndPrint(Arrays.stream(scanner.nextLine().split("\\s+")));
    }

    private static void sortAndPrint(Stream<String> wordStream) {
        wordStream.sorted().forEach(System.out::println);
    }

    /*
    Implemente un método que devuelva la cantidad de contraseñas de un flujo determinado.
     */
    private static void app02Stream() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countPasswords(Arrays.stream(scanner.nextLine().split("\\s+"))));
    }

    public static long countPasswords(Stream<String> passwordStream) {
        return passwordStream.count();
    }

    /*Implemente un método que imprima cada elemento de un flujo determinado de números excepto los dos primeros elementos.
     */
    private static void app01Stream() {
        Scanner scanner = new Scanner(System.in);
        printStream(Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt));
    }

    public static void printStream(Stream<Integer> stream) {
        // write your code here
        stream.skip(2).forEach(System.out::println);
    }


    private static void numbersPositives() {
        List<Integer> numbers = List.of(-1, -3, 3, 4, -5, 6, -7, -8, 9, 10);

        // usando un bucle for sin Stream
        /*
        int contador = 0;
        for (Integer number : numbers) {
            if (number > 5) {
                contador++;
            }
        }

        System.out.println("Numeros mayores a 5: " + contador);
         */

        // simplificando con Stream
        long countNumberFive = numbers.stream()
                .filter(number -> number > 5)
                .count();

        // .skip(4) => omite los primero 4 numeros de la lista

        System.out.println("Stream a 5: " + countNumberFive);

    }

    private static void namesCitiesUpperCase() {
        List<String> cities = List.of("Berlin", "Berlin", "Berlin", "Lima", "Oxapampa");

        /*
        Set<String> newCities = new HashSet<>(cities);

        for (String city : newCities) {
            System.out.println(city.toUpperCase());
        }
        */

        cities.stream()
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);
    }


}
