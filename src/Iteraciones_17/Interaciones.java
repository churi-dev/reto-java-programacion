package Iteraciones_17;

public class Interaciones {
    public static void main(String[] args) {
        ForIterator1();
        WhileIterator2();
        DoWhileIterator();
    }

    static void ForIterator1() {
        System.out.println("Iteracion 1: Foreach");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor: " + i);
        }
    }

    static void WhileIterator2() {
        System.out.println("Iteracion 2: While");
        int i = 0;
        while (i < 10) {
            System.out.println("Valor: " + i);
            i++;
        }
    }

    static void DoWhileIterator() {
        System.out.println("Iteracion 3: DoWhile");
        int i = 0;
        do {
            System.out.println("Valor: " + i);
            i++;
        } while ( i < 10);
    }
}
