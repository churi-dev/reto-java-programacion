package Recursividad_06;

public class Recursivo {
    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }

    static int Fibonacci(int numero) {
        if (numero == 0) {
            return 0;
        }
        if (numero == 1) {
            return 1;
        }
        return Fibonacci(numero - 1) + Fibonacci(numero - 2);
    }

    static int SumaArreglo(int [] numeros, int index) {
        if (index == numeros.length) {
            return 0;
        }

        System.out.println("Indice del arreglo: " + index);

        return numeros[index] + SumaArreglo(numeros, index + 1);
    }

    // recursividad: es una funcion que se llama asi misma teniendo una base que se tiene
    // que cumplir para finalizar la iteracion
    static void Contador(int numero) {
        if (numero == 0) {
            System.out.println("El contador llegó a su fin");
            return;
        }
        System.out.println("contador: " + numero);
        Contador(numero - 1);
    }

    // factorial de 3: 3*2*1 = 6
    static int Factorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        System.out.println(numero);
        return numero * Factorial(numero - 1);
    }
}
