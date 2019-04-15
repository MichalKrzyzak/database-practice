package com.myproject.dbpractice;

import com.myproject.entities.Student;
import com.myproject.entities.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

class Pusher {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    private void openConnection() {
        entityManagerFactory = Persistence.createEntityManagerFactory("myDatabaseFirstProgram");
        entityManager = entityManagerFactory.createEntityManager();
    }

    private void closeConnection() {
        entityManager.close();
        entityManagerFactory.close();
    }

    void pushToDatabase(Student student) {
        openConnection();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        closeConnection();
    }

    void pushToDatabase(Teacher teacher) {
        openConnection();
        entityManager.getTransaction().begin();
        entityManager.persist(teacher);
        entityManager.getTransaction().commit();
        closeConnection();
    }

}
