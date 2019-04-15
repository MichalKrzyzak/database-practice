package com.myproject.dbpractice;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

class UIModel {
    private String userChoice;

    UIModel(String userChoice) {
        this.userChoice = userChoice;
    }

    public String getUserChoice() {
        return userChoice;
    }
}