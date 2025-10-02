package CadenaCaracteres_05;

import java.util.Arrays;

public class Ejercicios {
    public static void main(String[] args) {
        System.out.println("Anagrama?: " + Isogramas("Jhon"));
    }
    static boolean Isogramas(String palabra) {

        palabra = palabra.toLowerCase();

        char [] letras = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }

        Arrays.sort(letras);

        char buffer = ' ';
        for (char letra : letras) {
            if (buffer == letra) {
                return false;
            }
            buffer = letra;
        }

        return true;
    }

    static boolean Polindromas(String palabra) {
        String comparacion = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            comparacion += palabra.charAt(i);
        }

        return palabra.equalsIgnoreCase(comparacion);
    }
    static boolean Anagrama(String palabra1, String palabra2) {

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        char [] charPalabra1 = new char[palabra1.length()];
        char [] charPalabra2 = new char[palabra2.length()];

        for (int i = 0; i < palabra1.length(); i++) {
            charPalabra1[i] = palabra1.charAt(i);
        }
        for (int i = 0; i < palabra2.length(); i++) {
            charPalabra2[i] = palabra2.charAt(i);
        }

        Arrays.sort(charPalabra1);
        Arrays.sort(charPalabra2);

       if (Arrays.equals(charPalabra1, charPalabra2)) {
           return true;
       } else {
           return false;
       }
    }
}
