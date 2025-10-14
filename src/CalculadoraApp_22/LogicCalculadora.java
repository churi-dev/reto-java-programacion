package CalculadoraApp_22;

import java.util.Scanner;

public class LogicCalculadora {

    private static Calculadora calculadora = new Calculadora();

    public static void Menu() {
        String mensaje = "**** Aplicación Calculadora ****\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Salir\n" +
                "Operación a realizar?: ";
        System.out.print(mensaje);
    }

    public static void App() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            Menu();
            try {
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1:
                        Suma();
                        break;
                    case 2:
                        Resta();
                        break;
                    case 3:
                        Multiplicacion();
                        break;
                    case 4:
                        Division();
                        break;
                    case 5:
                        System.out.println("Cerrando calculadora.");
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: debe ingresar un numero.");
                } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 5);
        teclado.close();

    }

    static void Suma() {
        System.out.print("Ingrese el numero 1: ");
        var numero1 = new Scanner(System.in).nextInt();
        System.out.print("Ingrese el numero 2: ");
        var numero2 = new Scanner(System.in).nextInt();

        var resultado = calculadora.suma(numero1, numero2);
        System.out.println("Resultado suma: " + resultado);
    }

    static void Resta() {
        System.out.print("Ingrese el numero 1: ");
        var numero1 = new Scanner(System.in).nextInt();
        System.out.print("Ingrese el numero 2: ");
        var numero2 = new Scanner(System.in).nextInt();

        var resultado = calculadora.resta(numero1, numero2);
        System.out.println("Resultado resta: " + resultado);
    }

    static void Multiplicacion() {
        System.out.print("Ingrese el numero 1: ");
        var numero1 = new Scanner(System.in).nextInt();
        System.out.print("Ingrese el numero 2: ");
        var numero2 = new Scanner(System.in).nextInt();

        var resultado = calculadora.multiplicacion(numero1, numero2);
        System.out.println("Resultado multiplicacion: " + resultado);
    }

    static void Division() {
        System.out.print("Ingrese el numero 1: ");
        var numero1 = new Scanner(System.in).nextInt();
        System.out.print("Ingrese el numero 2: ");
        var numero2 = new Scanner(System.in).nextInt();

        var resultado = calculadora.division(numero1, numero2);
        System.out.println("Resultado division: " + resultado);
    }
}
