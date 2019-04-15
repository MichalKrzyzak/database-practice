package com.myproject.dbpractice;

import java.util.Scanner;

/**
 * Created by Michał Krzyżak
 *  15.4.2019
 **/

public class UI {
    public void run() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to University of Java!");
        String userChoice;

        do {
            System.out.println("Please pick one function to continue:\n1 - Add student\n2 - Add teacher\n3 - Add field\n4 - Add department\nEnter \"exit\" or \"q\" to quit.");
            userChoice = userInput.nextLine().toLowerCase();
            try {
                if (!(userChoice.equals("exit") || userChoice.equals("q"))){
                    new UIModel(userChoice);
                } else {
                    System.out.println("Exiting...");
                }
            } catch (NullPointerException e) {
                System.out.println("Wrong input!");
            }
        } while (!(userChoice.equals("exit") || !userChoice.equals("q")));
    }
}
