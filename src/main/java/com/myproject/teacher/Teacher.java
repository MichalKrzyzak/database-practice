package com.myproject.teacher;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Michał Krzyżak
 * 11.4.2019
 **/

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "VARCHAR(25) NOT NULL")
    private String firstName;
    @Column(columnDefinition = "VARCHAR(25) NOT NULL")
    private String lastName;
    private String fieldOfTeaching;
    @Column(precision = 10, scale = 2)
    private BigDecimal salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFieldOfTeaching() {
        return fieldOfTeaching;
    }

    public void setFieldOfTeaching(String fieldOfTeaching) {
        this.fieldOfTeaching = fieldOfTeaching;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
