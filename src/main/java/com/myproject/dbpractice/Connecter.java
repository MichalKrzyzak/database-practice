package com.myproject.dbpractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Michał Krzyżak
 * 21.4.2019
 */

public interface Connecter {

    default EntityManager connect(EntityManagerFactory entityManagerFactory) {
        entityManagerFactory = Persistence.createEntityManagerFactory("myDatabaseFirstProgram");
        return entityManagerFactory.createEntityManager();
    }
}
