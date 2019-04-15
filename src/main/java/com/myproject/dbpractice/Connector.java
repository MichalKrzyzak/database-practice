package com.myproject.dbpractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Michał Krzyżak
 *  15.4.2019
 **/

public class Connector {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    void connect() {
        entityManagerFactory = Persistence.createEntityManagerFactory("myDatabaseFirstProgram");
        entityManager = entityManagerFactory.createEntityManager();
    }

    void disconnect(){
        entityManager.close();
        entityManagerFactory.close();
    }
}
