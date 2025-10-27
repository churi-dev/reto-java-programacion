package Collections_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClassArrayList {
    public static void main(String[] args) {
        AppExercise3();
    }

    private static void AppExercise3() {
        // ejercicio de ghestion de tarea
        ArrayList<String> taskList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String operation = scanner.nextLine();

            if (operation.equals("add")) {
                taskList.add(scanner.nextLine());
            } else if (operation.equals("remove")) {
                taskList.remove(Integer.parseInt(scanner.nextLine()));
            } else if (operation.equals("display")) {
                System.out.println(taskList);
                break;
            }
        }

        scanner.close();
    }

    private static void AppExercise2() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        final int number = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> result = findNumbersNeat(list1, number);

        result.forEach(n -> System.out.print(n + " "));
    }

    private static ArrayList<Integer> findNumbersNeat(ArrayList<Integer> list, int number) {
        ArrayList<Integer> result = new ArrayList<>();

        int distanceMin = Integer.MAX_VALUE;

        for (Integer i : list) {
            int valueDistance = Math.abs(i - number);
            if (valueDistance < distanceMin) {
                distanceMin = valueDistance;
            }
        }

        for (Integer i : list) {
            // calcular la distancia minima para comparar
            if (Math.abs(i - number) == distanceMin) {
                result.add(i);
            }
        }

        Collections.sort(result);

        return result;
    }


    private static void AppExercise1() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);

        ArrayList<Integer> result = concatPositiveNumbers(list1, list2);

        result.forEach(n -> System.out.print(n + " "));
    }

    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {

        /*
        ArrayList<Integer> numbersPositive = new ArrayList<>();

        for (Integer value1 : l1) {
            if (value1 > 0) {
                numbersPositive.add(value1);
            }
        }

        for (Integer value2 : l2) {
            if (value2 > 0) {
                numbersPositive.add(value2);
            }
        }
        */
        l1.addAll(l2); // unen en una sola l1 y l2
        l1.removeIf(n -> n < 0);
        return l1;
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    static void Ejemplo01() {

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        for (String name : nameList) {
            System.out.println(name);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);

        list.add(4, 2);
        list.add(1);
        list.set(0, 20);
        list.add(7);
        System.out.println(list);
    }
}
