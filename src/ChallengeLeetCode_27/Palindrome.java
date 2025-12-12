package ChallengeLeetCode_27;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean value = StringChallenge(sc.nextLine());
        System.out.println(value);
    }

    public static boolean StringChallenge(String str) {

        StringBuilder newText = new StringBuilder();

        for (Character c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newText.append(Character.toLowerCase(c));
            }
        }

        String textOriginal = newText.toString();
        String textInverted = new StringBuilder(textOriginal).reverse().toString();

        return textOriginal.equals(textInverted);
    }
}
