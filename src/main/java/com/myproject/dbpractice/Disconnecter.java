package com.myproject.dbpractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Michał Krzyżak
 * 21.4.2019
 */

public interface Disconnecter {

    default void disconnect(EntityManagerFactory entityManagerFactory, EntityManager entityManager) {
        entityManager.close();
        entityManagerFactory.close();
    }
}
