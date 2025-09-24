package Excepciones_10;

public class ExcepcionesMuestra {
    public static void main(String[] args) {

        try {
            int resultado = errorResultado(10);
            System.out.println("Resultado devuelto: " + resultado);
        } catch (ErrorPersonalizado e) {
            System.out.println("Error personalizado: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }

        // usando runtimeException => no obliga a usar el try
        int numeroPares = numerpPar(20);
        System.out.println("Par: " + numeroPares);
    }

    public static int numerpPar(int numero) {
        if (!(numero % 2 == 0)) {
            throw new ErrorPersonalizado2("El numero debe ser par");
        }

        return numero;
    }

    public static int errorResultado(int numero) throws ErrorPersonalizado, ArithmeticException, IllegalArgumentException {

        if (numero < 0) {
            throw new ErrorPersonalizado("El numero no puede ser negativo");
        } else if (numero == 0) {
            throw new ArithmeticException("El numero no puede ser igual a 0");
        } else if (numero > 1000) {
            throw new IllegalArgumentException("El numero no puede ser mayor que 1000");
        } else if (numero % 2 == 1) {
            throw new ErrorPersonalizado2("El numero debe ser par");
        }
        return numero;
    }
}

class ErrorPersonalizado extends Exception {
    public ErrorPersonalizado(String message) {
        super(message);
    }
}

class ErrorPersonalizado2 extends RuntimeException {
    public ErrorPersonalizado2(String message) {
        super(message);
    }
}
