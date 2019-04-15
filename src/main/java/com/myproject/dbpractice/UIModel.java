package com.myproject.dbpractice;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

class UIModel {
    private String userChoice;
    private String generate;

    UIModel(String userChoice, String generate) {
        this.userChoice = userChoice;
        this.generate = generate;
    }

    String getUserChoice() {
        return userChoice;
    }

    boolean isGenerated() {
        return generate.equals("generate");
    }
}