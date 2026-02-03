package Collections_26;
import java.util.*;
import java.util.stream.Collectors;

public class Collections {

    static void Ejercicio2Collection() {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }

    public static Collection<Integer> pow2(Collection<Integer> numbers) {

        Collection<Integer> powCollection = new ArrayList<>();

        for (Integer number: numbers) {
            powCollection.add(number * number);
        }

        return powCollection;
    }

    static void EjercicioColection1() {
        Scanner scanner = new Scanner(System.in);
        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Collection<String> nonBlockedPhones = filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));

        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }

    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {

        phones.removeAll(blacklist);

        return phones;
    }

    static void IteracionCollections() {
        Collection<String> colection = new ArrayList<>();
        colection.add("Ana");
        colection.add("Luis");
        colection.add("Carla");

        // bucle para
        for (String lista: colection ) {
            System.out.println(lista);
        }
    }

    static void CollectionsPart1() {

        // almacena objetos | no primitivos
        // Integer -> int
        // Character -> char
        // Bolean -> bolean
        // Double -> double

        Collection<String> colection = new ArrayList<>();

        colection.add("Ana");
        colection.add("Luis");
        colection.add("Carla");

        // tamanio de mapa
        System.out.println("L => " + colection.size());

        // si esta vacio o no tiene elementos
        System.out.println("Vacio?: " + colection.isEmpty()); // boollean

        // contiene el objecto especificado
        System.out.println(colection.contains("Luis")); // true | boolean

        // eliminar un objeto
        System.out.println(colection.remove("Carla")); // boolean

        // elimina varios objetos
        colection.removeAll(Arrays.asList("Luis", "Ana"));

        // elimina todo de un objeto
        colection.clear();

        colection.add("Juan");
        colection.add("Diego");
        colection.add("Pedro");
        System.out.println(colection);

    }
}
