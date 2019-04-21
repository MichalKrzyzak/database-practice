package com.myproject.dbpractice;

import com.myproject.entities.Salary;
import com.myproject.entities.Student;
import com.myproject.entities.Teacher;
import com.myproject.generator.Data;
import com.myproject.generator.IdentityNumber;
import com.myproject.generator.Pesel;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

class Create {
    private final Pusher pusher = new Pusher();
    private final Data data = new Data();
    private final Pesel pesel = new Pesel();
    private final IdentityNumber identityNumber = new IdentityNumber();
    private final Scanner input = new Scanner(System.in);

    void verifyCreation(String userChoice, boolean isGenerated) {
        switch (userChoice) {
            case "1":
                Student student;

                if (isGenerated) {
                    student = generateStudent();
                } else {
                    student = manualStudent();
                }

                pusher.pushToDatabase(student);
                break;
            case "2":
                Teacher teacher;

                if (isGenerated) {
                    teacher = generateTeacher();
                } else {
                    teacher = manualTeacher();
                }

                pusher.pushToDatabase(teacher);
                break;
            default:
                System.out.println("Wrong input!");
                break;
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
                .salary(generateSalary())
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
                .salary(manualSalary())
                .build();

    }

    private Salary generateSalary() {
        Random random = new Random();
        return new Salary.SalaryBuilder()
                .grossAmount(BigDecimal.valueOf(random.nextInt(10000) + 3000))
                .currenct("PLN")
                .build();
    }

    private Salary manualSalary() {
        System.out.println("Please enter teacher's gross salary:");
        String grossAmount = input.nextLine();
        System.out.println("Please enter currency of above salary:");
        String currency = input.nextLine();

        return new Salary.SalaryBuilder()
                .grossAmount(BigDecimal.valueOf(Long.parseLong(grossAmount)))
                .currenct(currency)
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
