package exercises;

import java.util.Scanner;

public class ExtendedAlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";

        System.out.println("Enter a word in the sentence:");
        String word = input.nextLine();

        System.out.println("Is the word in the sentence: " + text.toLowerCase().contains(word.toLowerCase()));
        int index = text.toLowerCase().indexOf(word.toLowerCase());
        System.out.println("The word begins at index: " + index);
        int length = word.length();
        System.out.println("The length of the word is: " + length);
        System.out.println(text.substring(0, index) + text.substring(index + length));

//        System.out.println(text.replaceFirst(word, ""));
    }
}
