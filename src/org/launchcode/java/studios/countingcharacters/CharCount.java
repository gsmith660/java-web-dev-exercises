package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        String hiddenFiguresQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string from which to compute character frequencies, or press ENTER to use a default test string: ");
        String frequencyCountString = input.nextLine();
        if (frequencyCountString.equals("")) {
            frequencyCountString = hiddenFiguresQuote;
        }
        input.close();


        HashMap<Character, Integer> counts = new HashMap<>();

        for (char c : frequencyCountString.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                if (counts.containsKey(c)) {
                    counts.replace(c, counts.get(c) + 1);
                } else {
                    counts.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
