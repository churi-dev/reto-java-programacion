package ChallengeLeetCode_27;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RunLengthWord {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String value = StringChallenge(s.nextLine());

        String token = "45xsghn6";

        String finalOutput = reverseText(value) + ":" + reverseText(token);

        System.out.println(finalOutput);
    }

    public static String StringChallenge(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder newText = new StringBuilder();

        map.forEach((k, v) -> newText.append(v).append(k));

        return newText.toString();
    }

    private static String reverseText(String str) {

        return new StringBuilder(str).reverse().toString();
    }
}
