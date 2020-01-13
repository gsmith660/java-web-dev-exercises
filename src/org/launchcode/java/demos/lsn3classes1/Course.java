package org.launchcode.java.demos.lsn3classes1;

import java.util.List;

public class Course {

    private int credits;
    private List<Student> roster;
    private Teacher teacher;

    public int getCredits() {
        return credits;
    }

    public List<Student> getRoster() {
        return roster;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setCredits(int aCredits) {
        credits = aCredits;
    }

    public void setRoster(List<Student> aRoster) {
        roster = aRoster;
    }

    public void setTeacher(Teacher aTeacher) {
        teacher = aTeacher;
    }
}
