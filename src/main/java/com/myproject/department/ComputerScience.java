package com.myproject.department;

/**
 * Created by Michał Krzyżak
 * 11.4.2019
 **/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComputerScience implements Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long numberOfFields;
    private String headOfDepartment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumberOfFields() {
        return numberOfFields;
    }

    public void setNumberOfFields(long numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }
}
