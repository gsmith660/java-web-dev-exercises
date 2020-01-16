package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name) {
        setName(name);
        setStudentId(nextStudentId);
        setNumberOfCredits(1);
        setGPA(4.0);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGPA() {
        return gpa;
    }


    private void setName(String aName) {
        name = aName;
    }

    private void setStudentId(int aStudentId) {
        studentId = aStudentId;
        nextStudentId++;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public void setGPA(double aGPA) {
        gpa = aGPA;
    }

}