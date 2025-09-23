package CadenaCaracteres_05;

public class MathMetodo {
    public static void main(String[] args) {
        ArreglosBidimensionales();
    }

    static void ArreglosBidimensionales() {

        int [][] edades;

        // filas y columnas
        String [][] nombres = new String[2][3];

        int [] [] salarios = {
                {102, 200, 40},
                {10, 30, 1000}
        };

        // longitud de una matriz
        var filas = salarios.length;
        System.out.println("Filas: " + filas);
        var columnas = salarios[0].length;
        System.out.println("Columnas: " + columnas);

        // acceder a valores: posicion 1: fila 0 y columna 0
        var valor1 = salarios[0][0];
        System.out.println("Valor1: " + valor1);

        // recorrer la matriz, dos bucles, recorrer las filas y otra las columnas
        for (int fila = 0; fila < salarios.length; fila++) {
            System.out.println("Fila: " + fila);
            for (int columna = 0; columna < salarios[fila].length; columna++) {
                System.out.println("Columna: " + columna);
                System.out.println("Valor: " + salarios[fila][columna]);
            }
        }
    }

    static void ArreglosUnidimensionales() {
        // arreglo: estructura de datos que almacena valores por indice, valores iguales
        // y define el tamaño

        // arreglo de cadena
        String [] nombres; // definir
        // incializar el arreglo, definir tamaño
        nombres = new String[3];

        // definir e inicializar
        int [] edades = new int[4];

        // definir e inicializar con datos
        double [] pesos = { 20.4, 10.5, 50.6 };

        // acceder los valores por medio de indices
        var valor1 = pesos[0]; // 20.4

        // usando un bucle para recorrer y mostrar datos
        for (double valores : pesos) {
            System.out.println(valores);
        }
    }

    static void BucleForContinue() {
        for (int index = 0; index < 10; index++) {
            if (index == 4) {
                continue;
            }
            System.out.println(index);
        }
    }
    static void BucleForBreak() {
        for (int index = 0; index < 10; index++) {
            if (index == 2) {
                break;
            }
            System.out.println(index);
        }
    }

    static int BucleWhile() {
        int contador = 0, suma = 0;
        while (contador <= 5) {
            suma += contador;
            contador++;
        }

        return suma;
    }

    static void Booleanos() {
        // los booleanos solo devuelven dos valores true o false
        var isTrue = false;
        System.out.println(!isTrue);

        // por metodos de comparacion
        int miEdad = 22;
        if (miEdad > 18) {
            System.out.println("Eres mayor de edad");
        }
    }

    static void metodoMaximo() {
        // metodo que retorna el valor maximo
        var numeroMayor = Math.max(10, 20);
        System.out.println(numeroMayor);

        // metodo que retona numeroMenor
        var numeroMenor = Math.min(100, -5);
        System.out.println(numeroMenor);

        // metodo para obtener la raiz cuadrada de un numero
        var raizNumero = Math.sqrt(81);
        System.out.println(raizNumero);

        // metodo para potencia de un numero
        // segundo campo es a que va estar elevado el primer numero
        var potenciaCuadrado = Math.pow(8, 2); // 64
        System.out.println(potenciaCuadrado);

        // para obtener un numero random entre un intervalo de 0 a n
        // 1 a 10
        var numeroAlteatorio = Math.round(Math.random() * 10) + 1;
        System.out.println(numeroAlteatorio);

        // metodo para redondeo | floor | sin rendeo
        var numero = 10.5;
        System.out.println(Math.floor(numero));
    }
}
