package PilasColas_07;

import java.util.ArrayList;

public class Pilas {

    public static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) {

        // definir nuestra pila con arrayList
        push(10);
        push(20);
        mostrarPila();
        pop();
        mostrarPila();
    }

    // metodos para mostrar
    static void mostrarPila() {
        System.out.println("Pila: ");
        String space = " => ";
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + space);
            if (i == stack.size() - 2) {
                space = "\n";
            }
        }
    }

    static void push(int numero) {
        stack.add(numero);
    }

    static int pop() {
        return stack.remove(stack.size() - 1);
    }
}
