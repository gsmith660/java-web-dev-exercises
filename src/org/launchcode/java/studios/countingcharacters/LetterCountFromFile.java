package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
//import java.util.List;
//import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class LetterCountFromFile {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(LetterCountFromFile.class.getResourceAsStream("inputText.txt"));

//        List<String> fileLines = new ArrayList<String>();
//        while (in.hasNextLine()) {
//            fileLines.add(in.nextLine());
//        }
//        in.close();
//        String frequencyCountString = String.join("\n", fileLines);

        in.useDelimiter("\\Z");
        String frequencyCountString = in.next();

        Map<Character, Integer> counts = new HashMap<>();
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
