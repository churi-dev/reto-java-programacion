package ChallengeLeetCode_27;

import java.util.Scanner;

public class LargeWord {

    private final static String  token = "45xsghn6";

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String value =  StringChallenge(s.nextLine());

        String finalOutPut = reverseString(value) + ":" + reverseString(token);
        System.out.println(finalOutPut);

    }

    private static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static String StringChallenge(String sen) {
        // solo obtener palabras y puede contener numeros: hola123
        String value = sen.replaceAll("[^a-zA-Z0-9]", " ");

        String[] words = value.split("\\s+");

        String wordLarge = "";

        for (String word : words) {
            if (word.length() > wordLarge.length()) {
                wordLarge = word;
            }
        }
        return wordLarge;
    }
}
