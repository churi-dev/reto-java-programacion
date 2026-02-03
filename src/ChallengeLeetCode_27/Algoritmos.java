package ChallengeLeetCode_27;

import java.util.Scanner;

public class Algoritmos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        var value = RecursionChallenge(Integer.parseInt(s.nextLine()));

        // string
        String valueFactorial = Long.toString(value);
        String finalOutput = ReverseString(valueFactorial) + ":" + ReverseString("45xsghn6");

        System.out.println(finalOutput);
    }

    private static String ReverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static long RecursionChallenge(int num) {

        long result = 1;

        for (int i = 2; i <= num; i++) {

            result = result * i;
        }

        return result;
    }




}
