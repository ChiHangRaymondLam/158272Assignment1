/*
Chi Hang Lam
17026690
159272 Assignment 1
11/5/2020
 */

package assignment1;

import java.time.LocalDate;

public class Student {
    private String surename;
    private String firstname;
    private String id;
    private java.time.LocalDate dob;

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    private Course course;

    public String clone() {

    }
}
