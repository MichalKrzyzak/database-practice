package com.myproject.dbpractice;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

class UIController {
    private UIModel model;

    UIController(UIModel model) {
        this.model = model;
        parseUserChoice();
    }

    private void parseUserChoice() {
        new ChoiceParser().parseUsersChoice(model.getUserChoice());
    }
}
