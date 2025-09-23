package PilasColas_07;

import java.util.ArrayList;

public class Colas {

    public static ArrayList<String> cola = new ArrayList<>();

    public static void main(String[] args) {
        enqueue("Juan");
        enqueue("Pedro");
        mostrarCola();
        System.out.println("Elimiando: " +dequeue());
        mostrarCola();
    }

    static void mostrarCola() {
        System.out.println("Cola: ");
        String space = " => ";
        for (int i = 0; i < cola.size(); i++) {
            System.out.print(cola.get(i) + space);
            if (i == cola.size() - 2) {
                space = "\n";
            }
        }
    }

    static void enqueue(String elemento) {
        cola.add(elemento);
    }

    static String dequeue() {
        String number = cola.get(0);
        cola.remove(0);
        return number;
    }
}
