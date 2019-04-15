package com.myproject.dbpractice;

/**
 * Created by Michał Krzyżak
 * 15.4.2019
 **/

class UIController {
    private UIModel model;

    UIController(UIModel model) {
        this.model = model;
        createObjects();
    }

    private void createObjects() {
        new Create().verifyCreation(model.getUserChoice(), model.isGenerated());
    }
}