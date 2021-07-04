package com.geektech;

public class Lexus extends Car {

    private String model;
    private Bmw engine;
    private Color white;

    public Lexus(String name, String color, int yearOfIssue, String model) {
        super(name, color, yearOfIssue);
        this.model = model;

    }

    public String getModel() {
        return model;
    }
}
