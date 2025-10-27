package Collections_26;
import java.util.*;
import java.util.stream.Collectors;

public class InterfaceList {
    public static void main(String[] args) {
        CambioPalabraList();
    }

    static void changeList(List<String> list) {
        String palabralarga = "";
        for (String listItem : list) {
            if (listItem.length() > palabralarga.length()) {
                palabralarga = listItem;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, palabralarga);
        }
    }

    static void CambioPalabraList() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }

    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();

        int fromIndex;

        for (fromIndex = 0; fromIndex < list.size(); fromIndex+=subListSize) {

            int toIndex = Math.min(fromIndex + subListSize, list.size());
            sublists.add(list.subList(fromIndex, toIndex));
        }

        return sublists;
    }

    static void ListEjercicio3() {
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");


        final List<Integer> list = Arrays.asList(values).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final int subListSize = Integer.parseInt(scanner.nextLine());

        final List<List<Integer>> subLists = splitListIntoSubLists(list, subListSize);

        subLists.forEach(subList -> {
            final String representation = subList.stream().map(Object::toString).collect(Collectors.joining(" "));
            System.out.println(representation);
        });
    }


    public static <T> T getElementByIndex(List<T> lst, int index) {

        int realIndex;

        if (index < 0) {
            realIndex = lst.size() + index;
        } else {
            realIndex = index;
        }

        if (realIndex < 0 || realIndex >= lst.size()) {
            throw new IndexOutOfBoundsException();
        }

        return lst.get(realIndex);
    }

    static void ListEjercicio2() {
        final Scanner scanner = new Scanner(System.in);

        final List<String> values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        final int index = Integer.parseInt(scanner.nextLine());

        try {
            String element = getElementByIndex(values, index);
            System.out.println(element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }

    static void ListEjercicio1() {

        List<GreekLetter> letterList = new ArrayList<>();

        letterList.add(new GreekLetter("Gamma",  3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha",  1));

        for (GreekLetter letter : letterList) {
            System.out.println(letter);
        }
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}
