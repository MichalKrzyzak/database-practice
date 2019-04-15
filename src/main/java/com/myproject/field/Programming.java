package com.myproject.field;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Michał Krzyżak
 *  11.4.2019
 **/

@Entity
public class Programming {
    @Id
    private long numberOfStudents;
    private long numberOfTeachers;
    private String department;

    public long getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(long numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public long getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public void setNumberOfTeachers(long numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
