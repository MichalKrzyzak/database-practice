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

class Pusher implements Connecter, Disconnecter {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabaseFirstProgram");
    private EntityManager entityManager;

    void pushToDatabase(Student student) {
        entityManager = connect(entityManagerFactory);
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        disconnect(entityManagerFactory, entityManager);
    }

    void pushToDatabase(Teacher teacher) {
        entityManager = connect(entityManagerFactory);
        entityManager.getTransaction().begin();
        entityManager.persist(teacher);
        entityManager.getTransaction().commit();
        disconnect(entityManagerFactory, entityManager);
    }
}
