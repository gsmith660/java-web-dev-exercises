package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(sumEven(numbers));

        List<String> words = new ArrayList<>(Arrays.asList(ArrayPractice.seuss.split(" |, |\\. |\\.")));
        printWordsOfFixedLength(words, 5);
    }

    private static int sumEven(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    private static void printWordsOfFixedLength(List<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

}
