package com.geektech;

public class Car {

    private String name;
    private String color;
    private int yearOfIssue;

    public Car(String name, String color, int yearOfIssue) {
        this.name = name;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
