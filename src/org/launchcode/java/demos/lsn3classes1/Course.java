package org.launchcode.java.demos.lsn3classes1;

import java.util.List;

public class Course {

    private Teacher teacher;
    private List<Student> roster;
    private int credits;

    public Course(Teacher teacher, List<Student> roster, int credits) {
        this.teacher = teacher;
        this.roster = roster;
        this.credits = credits;
    }



    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setRoster(List<Student> roster) {
        this.roster = roster;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public int getCredits() {
        return credits;
    }

    public List<Student> getRoster() {
        return roster;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
