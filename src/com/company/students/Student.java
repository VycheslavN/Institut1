package com.company.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String family, group, course, averageScore;
    public Student(String family, String group, String course, String averageScore) {
        this.family = family;
        this.group = group;
        this.course = course;
        this.averageScore = averageScore;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore;
    }
    public void println() {
        System.out.println(family + " " + group + " " + course + " " + averageScore);
    }
}



