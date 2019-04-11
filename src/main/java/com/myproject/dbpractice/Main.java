package com.myproject.dbpractice;

/**
 * Created by Michał Krzyżak
 *  11.4.2019
 **/

import com.myproject.dbpractice.student.Student;
import com.myproject.dbpractice.teacher.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabaseFirstProgram");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Student student = new Student();
        student.setFirstName("Michał");
        student.setLastName("Krzyżak");
        student.setFieldOfStudy("Computer Science");

        Student student2 = new Student();
        student2.setFirstName("Jan");
        student2.setLastName("Kowalski");
        student2.setFieldOfStudy("Physics");

        Teacher teacher = new Teacher();
        teacher.setFirstName("Grażyna");
        teacher.setLastName("Naukowa");
        teacher.setFieldOfTeaching("Computer Science");
        teacher.setSalary(new BigDecimal(3201.65));

        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.persist(student2);
        entityManager.persist(teacher);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
