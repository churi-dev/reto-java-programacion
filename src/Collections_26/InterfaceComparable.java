package Collections_26;

import java.util.*;
import java.util.Collections;

public class InterfaceComparable {
    public static void main(String[] args) {
        notePositivesNegatives();
    }

    private static void notePositivesNegatives() {
        Scanner sc = new Scanner(System.in);
        List<Rating> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            int[] votes = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Rating rating = createRating(votes[0], votes[1]);
            list.add(rating);
        }
        Collections.sort(list);
        Checker.check(list);
    }

    private static Rating createRating(int up, int down) {
        Rating rating = new Rating();
        rating.setUpVotes(up);
        rating.setDownVotes(down);
        return rating;
    }

    static class Checker {
        static void check(List<Rating> list) {
            for (int i = 1; i < list.size(); i++) {
                var curr = list.get(i);
                var prev = list.get(i  - 1);
                if (curr.getUpVotes() - curr.getDownVotes() < prev.getUpVotes() - prev.getDownVotes()) {
                    System.out.println("Incorrect sorted order");
                    return;
                }
            }
            System.out.println("Correct sorted order");
        }
    }


    static class Rating implements Comparable<Rating> {
        private int upVotes;
        private int downVotes;

        public int getUpVotes() {
            return upVotes;
        }

        public void setUpVotes(int upVotes) {
            this.upVotes = upVotes;
        }

        public int getDownVotes() {
            return downVotes;
        }

        public void setDownVotes(int downVotes) {
            this.downVotes = downVotes;
        }

        @Override
        public int compareTo(Rating rating) {
            var thisNetScore = this.upVotes - this.downVotes;
            var otherNetScore = rating.getUpVotes() - rating.getDownVotes();
            return Integer.compare(thisNetScore, otherNetScore);
        }
    }

    private static void UsandoClassParaComparar() {
        List<Car> cars = new ArrayList<>();

        var lista =  Arrays.asList(
                new Car(20, "Model A", "Negro", 100),
                new Car(10, "Model B", "Blanco", 110),
                new Car(30, "Model D", "Rojo", 100),
                new Car(50, "Model F", "Rosando", 50),
                new Car(60, "Model H", "Plomo", 70)
        );

        cars.addAll(lista);

        // tratamos de ordenar usando el metodo sort
        Collections.sort(cars);
        System.out.println(cars);
    }

    static void IdeasClarasComparable() {
        // usado para ordenar elementos o tipos personalizados

        // ejemplo
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(100);
        lista.add(45);
        lista.add(34);

        // ordenamos elementos
        Collections.sort(lista); // menor a mayor
        System.out.println(lista);
    }

    static class Car implements Comparable<Car> {

        private int number;
        private String Model;
        private String color;
        private int weight;

        Car(int number, String Model, String color, int weight) {
            this.number = number;
            this.Model = Model;
            this.color = color;
            this.weight = weight;
        }

        @Override
        public int compareTo(Car otherCar) {
            return Integer.valueOf(getNumber()).compareTo(otherCar.getNumber());
        }

        @Override
        public String toString() {
            return "Car{" +
                    "number=" + number +
                    ", Model='" + Model + '\'' +
                    ", color='" + color + '\'' +
                    ", weight=" + weight +
                    "}\n" ;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getModel() {
            return Model;
        }

        public void setModel(String model) {
            Model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}
