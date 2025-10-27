package Collections_26;

import java.util.*;
import java.util.stream.Collectors;

public class InterfaceSet {
    public static void main(String[] args) {
        Ejercicio4Set();
    }

    static void Ejercicio4Set() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] names = input.split(",");

        // valores no repetidos
        Set<String> nameSet = new LinkedHashSet<>(Arrays.asList(names));

        System.out.println(String.join("," , nameSet));
        /*
        for (String name : names) {
            nameSet.add(name);
        }

        System.out.println(nameSet.stream()
                .map(Object::toString)
                .collect(Collectors.joining(",")));

         */


    }

    static void Ejercicio3Set() {
        Set<String> langs1 = new HashSet<>();

        langs1.add("Java");
        langs1.add("Scala");
        langs1.add("Kotlin");

        Set<String> langs2 = new HashSet<>();

        langs2.add("Python");
        langs2.add("Kotlin");
        langs2.add("JAVA");

        langs1.addAll(langs2);
        System.out.println(langs1);
    }

    static void Ejercicio2Set()  {
        Scanner scanner = new Scanner(System.in);

        Set<String> set1 = readStringSet(scanner);
        Set<String> set2 = readStringSet(scanner);

        System.out.println(isStrictSuperset(set1, set2));
    }

    private static <T> boolean isStrictSuperset(Set<T> set1, Set<T> set2) {
        // retorna true -> si el segundo conjunto contiene todos los elementos del primero y los conjuntos no son iguales.
        if (set2.containsAll(set1)  && !set1.equals(set2)) {
            return true;
        }
        return false;
    }

    private static Set<String> readStringSet(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toSet());
    }

    static void Ejercicio1Set() {
        Set<Integer> set = new HashSet<>();

        set.addAll(Set.of(1, 2, 3, 4));
        System.out.println(set);

        // solo queda si el valor se encuentra el conjunto
        set.retainAll(Set.of(2, 3, 4, 5));
        System.out.println(set);

        // remover 1 y 2
        set.removeAll(Set.of(1, 2)); // 3, 4
        System.out.println(set);
    }

    static void CollectionHastSet() {
        Set<String> set = Set.of("A", "B", "C"); // establecemoos valores fijos -> constantes
        //set.add("Juan"); // no permite

        System.out.println(set);

        // no existe un orden de insercion -> HashSet
        HashSet<Integer> edades = new HashSet<>();
        edades.add(20);
        edades.add(30);

        System.out.println(edades);

    }
}
