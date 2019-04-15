package com.myproject;

/**
 * Created by Michał Krzyżak
 * 11.4.2019
 **/

import com.myproject.dbpractice.UI;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.run();
    }
}

//        Student student = new Student();
//        student.setFirstName("Michał");
//        student.setLastName("Krzyżak");
//        student.setFieldOfStudy("Programming");
//
//        Student student2 = new Student();
//        student2.setFirstName("Jan");
//        student2.setLastName("Kowalski");
//        student2.setFieldOfStudy("Astronomy");
//
//        Student student3 = new Student();
//        student3.setFirstName("Alicja");
//        student3.setLastName("Fajna");
//        student3.setFieldOfStudy("Programming");
//
//        Teacher teacher = new Teacher();
//        teacher.setFirstName("Bartłomiej");
//        teacher.setLastName("Mroczek");
//        teacher.setFieldOfTeaching("Programming");
//        teacher.setSalary(new BigDecimal(9868.55));
//
//        Teacher teacher2 = new Teacher();
//        teacher2.setFirstName("Grażyna");
//        teacher2.setLastName("Gwiazda");
//        teacher2.setFieldOfTeaching("Astronomy");
//        teacher2.setSalary(new BigDecimal(3534.55));
//
//        Programming programming = new Programming();
//        programming.setDepartment("Computer Science");
//        programming.setNumberOfStudents(2);
//        programming.setNumberOfTeachers(1);
//
//        Astronomy astronomy = new Astronomy();
//        astronomy.setDepartment("Physics");
//        astronomy.setNumberOfStudents(1);
//        astronomy.setNumberOfTeachers(1);
//
//        Physics physics = new Physics();
//        physics.setNumberOfFields(1);
//        physics.setHeadOfDepartment("Grażyna Gwiazda");
//
//        ComputerScience computerScience = new ComputerScience();
//        computerScience.setNumberOfFields(1);
//        computerScience.setHeadOfDepartment("Bartłomiej Mroczek");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(student);
//        entityManager.persist(student2);
//        entityManager.persist(student3);
//        entityManager.persist(teacher);
//        entityManager.persist(teacher2);
//        entityManager.persist(programming);
//        entityManager.persist(astronomy);
//        entityManager.persist(physics);
//        entityManager.persist(computerScience);
//        entityManager.getTransaction().commit();