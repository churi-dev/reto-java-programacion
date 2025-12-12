package ChallengeLeetCode_27;

public class Array {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();

        int value = -121;

        text.append(value).reverse();

        if (value == Long.parseLong(text.toString())) {
            System.out.println(value);
            System.out.println(text);
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
