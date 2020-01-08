package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

    public static void main(String[] args) {
        int[] fib = {1, 1, 2, 3, 5, 8};
        for (int num : fib) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

        String[] words = seuss.split("(?<=\\.) ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(Arrays.toString(words));
    }
}
