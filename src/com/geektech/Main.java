package com.geektech;

public class Main {

    public static void main(String[] args) {

        Lexus lexus = new Lexus("Lexus","White",2000,"X5");
        Mers mers = new Mers("Mers","Black",2020,"XX3",2323);
        Mers mers1 = new Mers("Mers1","Blue",2021,"XX1",2019);
        System.out.println(mers.getModel());
        System.out.println(" Name:" + lexus.getName() + " Model:" + lexus.getModel() + " Color:" + lexus.getColor() +
                 " YearOfIssue:" +  lexus.getYearOfIssue());

        System.out.println("Name:" + mers.getName() + " Model:" + mers.getModel() + " Color:" + mers.getColor() +
                " YearOfIssue:" +  mers.getYearOfIssue());

        System.out.println("Name:" + mers1.getName() + " Model:" + mers1.getModel() + " Color:" + mers1.getColor() +
                " YearOfIssue:" +  mers1.getYearOfIssue());


    }
}
