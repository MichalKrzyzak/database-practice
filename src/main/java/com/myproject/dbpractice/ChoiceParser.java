package com.myproject.dbpractice;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

class ChoiceParser {
    void parseUsersChoice(String userChoice) {
        if (userChoice.equals("1")) {
            System.out.println("You are adding student.");
        } else if (userChoice.equals("2")) {
            System.out.println("You are adding teacher.");
        } else if (userChoice.equals("3")) {
            System.out.println("You are adding field.");
        } else if (userChoice.equals("4")) {
            System.out.println("You are adding department.");
        }
    }
}
