package Operadores_Control_02;

public class EsctruraControl {
    public static void main(String[] args) {

        // arimeticos
        int numero1 = 10, numero2 = 11, suma, resta, multplicacion;

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multplicacion = numero1 * numero2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multplicacion);

        // comparacion
        System.out.println(numero1 == numero2);
        System.out.println(numero1 > numero2);

        // logico
        System.out.println(numero1 > 10 && numero2 < 20);
        System.out.println(numero2 > 10 || numero1 < 20);

        // asignacion
        numero2++; // post incremento
        System.out.println(numero2); // si necesita llamarse para incrementar
        System.out.println(++numero2); // pre incremento, no se necesita llamarse para incremenrar

        /*
        1. Crea un programa que imprima por consola todos los números comprendidos
        * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
        */
        ParesMultiplos();
    }

    static void ParesMultiplos() {

        for (int index = 10; index <= 55; index++) {
            if (!(index % 3 == 0)  && index % 2 == 0 && index != 16) {
                System.out.println(index);
            }
        }
    }
}
