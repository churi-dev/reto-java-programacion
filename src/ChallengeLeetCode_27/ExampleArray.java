package ChallengeLeetCode_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExampleArray {
    public static void main(String[] args) {

        Integer [] arr = {2, 2, 4, 2, 3, 5, 5, 6};

        ArrayList<Integer> list = new ArrayList<>(arr.length);

        list.addAll(Arrays.asList(arr));

        Collections.reverse(list);
        System.out.println(list);

        System.out.println(list.lastIndexOf(5));
    }

}
