package com.geektech;

public final class Mers extends Lexus {

    private int numberOfЕheСar;


    public Mers(String name, String color, int yearOfIssue,
                String model, int numberOfЕheСar) {
        super(name, color, yearOfIssue, model);
        this.numberOfЕheСar = numberOfЕheСar;

    }

    public int getNumberOfЕheСar() {
        return numberOfЕheСar;
    }

    @Override
    public String getModel() {
        return "Mers model";
    }
}
