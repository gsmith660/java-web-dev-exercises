package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and id numbers
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Identification Number: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                // Read in the newline before looping back to prevent exiting loop
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClaass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (ID: " + student.getKey() + ")");
        }
    }
}
