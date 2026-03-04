package Arreglos_29;

public class Arreglos {
    public static void main(String[] args) {
        bucleForEach();
    }
    static void definicion() {
        // Los arreglos nos permiten guardar o agrupar datos similares (mismo tipo) en un solo contenedor
        // Los arreglos son estructuras de datos que permiten almacenar valores en una sola variable

        // declarar un tipo de arreglo
        int [] myArray1; // entero
        // inicializar el arreglo y colocar la cantidad o longitud de dato a usar
        myArray1 = new int [5];

        // una solo declaracion e inicializacion
        String [] myArray2 = new String [4];

        // dos formas de poblar el arreglo
        // N° 1 => asignar durante la declaracion del arreglo
        double [] weigths = {30.50, 40.50, 30.50};

        // N° 2 => asignar despues de la declaracion
        int [] ages = new int [3];

        ages[0] = 15;
        ages[1] = 20;
        ages[2] = 22;

        // acceder a un elemento almacendo por su indice
        //System.out.println(ages[0]);
    }
    /* EJERCICIO DE MOSTRAR LOS VALORES POR MEDIO DE SU INDICE */
    static void ejercicio1() {
        int [] numbers = {20, 10, 30};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        // cambiar su valor de indice 1 a 40
        numbers[1] = 40;
        System.out.println(numbers[2]);
    }
    static void cicloFor() {
        int [] numbers = {20, 10, 30};

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

    }
    static void condicionIf() {
        int [] numeros = {100, 20, 40, 50};

        for (int index = 0; index < numeros.length; index++) {
            if (numeros[index] == 50) {
                System.out.println("Encontramos el numero 50 | indice: " + index);
                break;
            }
        }
    }
    static void bucleForEach() {
        String [] names = {"Deyvi", "Jose", "Manuel", "Jhon"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}
