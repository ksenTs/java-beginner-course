package com.beginner.oop.encapsulation;

public class Car {
    //first example
    private String model;
    private String number;

    public Car(String model, String number) {
        this.setModel(model);
        this.setNumber(number);
    }

    // second example
    private void switchSpeed() {
        // switch logic
    }

    public void run() {
        // run logic
    }

    public void stop() {
        // stop logic
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
