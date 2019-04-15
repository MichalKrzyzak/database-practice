package com.myproject.dbpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

public class UI {
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to University of Java!");
        String userInput;

        do {
            System.out.println("Please pick one function to continue:\n1 - Add student\n2 - Add teacher\nIf you want to generate data please add \"generate\" after number. If not, please add \"manual\" after number.\nEnter \"exit\" or \"q\" to quit.");
            userInput = input.nextLine().toLowerCase();

            try {
                if (!(userInput.equals("exit") || userInput.equals("q"))) {
                    List<String> userInputList = Arrays.asList(userInput.split("[-, ]"));
                    UIModel uiModel = new UIModel(userInputList.get(0), userInputList.get(1));
                    new UIController(uiModel);
                } else {
                    System.out.println("Exiting...");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong input!");
            }

        } while (!(userInput.equals("exit") || !userInput.equals("q")));
    }
}