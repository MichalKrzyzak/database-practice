package com.myproject.entities;

import com.myproject.dbpractice.Pusher;
import com.myproject.generator.Data;
import com.myproject.generator.IdentityNumber;
import com.myproject.generator.Pesel;

import java.util.Scanner;

/**
 * Created by Michał Krzyżak
 *  15.4.2019
 **/

public class Create {
    private final Pusher pusher = new Pusher();
    private final Data data = new Data();
    private final Pesel pesel = new Pesel();
    private final IdentityNumber identityNumber = new IdentityNumber();
    private final Scanner input = new Scanner(System.in);

    public void verifyCreation(String userChoice, boolean doGenerate) {
        if (userChoice.equals("1")) {
            Student student;

            if (doGenerate) {
                student = generateStudent();
            } else {
                student = manualStudent();
            }

            pusher.pushToDatabase(student);
        } else if (userChoice.equals("2")) {
            Teacher teacher;

            if (doGenerate) {
                teacher = generateTeacher();
            } else {
                teacher = manualTeacher();
            }

            pusher.pushToDatabase(teacher);
        } else if (userChoice.equals("3")) {

        } else if (userChoice.equals("4")) {

        } else {
            System.out.println("Wrong input!");
        }
    }

    private Student generateStudent() {
        return new Student.StudentBuilder()
                .firstName(data.getName())
                .lastName(data.getLastName())
                .identityNumber(identityNumber.getIdentity())
                .peselNumber(pesel.getPesel())
                .fieldOfStudy(getFieldOfStudy())
                .build();
    }

    private Student manualStudent() {
        System.out.println("Please enter student's first name:");
        String firstName = input.nextLine();
        System.out.println("Please enter student's last name:");
        String lastname = input.nextLine();
        System.out.println("Please enter student's identity number:");
        String identityNumber = input.nextLine();
        System.out.println("Please enter student's PESEL number:");
        String peselNumber = input.nextLine();

        return new Student.StudentBuilder()
                .firstName(firstName)
                .lastName(lastname)
                .identityNumber(identityNumber)
                .peselNumber(peselNumber)
                .fieldOfStudy(getFieldOfStudy())
                .build();

    }

    private Teacher generateTeacher() {
        return new Teacher.TeacherBuilder()
                .firstName(data.getName())
                .lastName(data.getLastName())
                .identityNumber(identityNumber.getIdentity())
                .peselNumber(pesel.getPesel())
                .subject(getSubject())
                .build();
    }

    private Teacher manualTeacher() {
        System.out.println("Please enter student's first name:");
        String firstName = input.nextLine();
        System.out.println("Please enter student's last name:");
        String lastname = input.nextLine();
        System.out.println("Please enter student's identity number:");
        String identityNumber = input.nextLine();
        System.out.println("Please enter student's PESEL number:");
        String peselNumber = input.nextLine();

        return new Teacher.TeacherBuilder()
                .firstName(firstName)
                .lastName(lastname)
                .identityNumber(identityNumber)
                .peselNumber(peselNumber)
                .subject(getSubject())
                .build();

    }

    private String getFieldOfStudy() {
        System.out.println("Please enter student's field of study:");
        return input.nextLine();
    }

    private String getSubject() {
        System.out.println("Please enter teacher's subject:");
        return input.nextLine();
    }
}
