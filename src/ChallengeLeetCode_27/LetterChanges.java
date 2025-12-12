package ChallengeLeetCode_27;

import java.util.Scanner;

public class LetterChanges {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        var value = StringChallenge(s.nextLine());

        String token = "45xsghn6";

        String converUpperCase = convertUpperCase(value);
        String finalOutPut = reverseString(converUpperCase) + ":" + reverseString(token) ;

        System.out.println(finalOutPut);
         */

        String miNombre = "Jhon Churivanti";

        if (miNombre.indexOf("n") !=  -1) {
            System.out.println("indice: " + true);
            var newValue = miNombre.substring(0, miNombre.indexOf("n"));
            System.out.println(newValue);
        } else {
            System.out.println("indice: " + miNombre.indexOf("cd"));
        }

    }

    public static String StringChallenge(String str) {

        StringBuilder newText = new StringBuilder();

        var newArry = str.toCharArray();

        for (char c : newArry) {

            if (Character.isLetter(c)) {
                if (c == 'z') {
                    c = 'a';
                } else if (c == 'Z') {
                    c ='A';
                } else {
                    c++;
                }
            }
            newText.append(c);
        }

        return newText.toString();
    }

    public static String convertUpperCase(String str) {

        StringBuilder newText = new StringBuilder();

        for (char c : str.toCharArray()) {
            // primero convierte el valor en minuscula para corroborar si existe el carcter : a e i o u
            if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
                c = Character.toUpperCase(c);
            }
            newText.append(c);
        }

        return newText.toString();
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
