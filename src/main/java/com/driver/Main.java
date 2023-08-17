package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "Harsh";
        // System.out.println(obj.name);
        // as name has a private access modifier so direct access or setting it will show error, so
        // we have to use getter and setter to access and setting the name variable

        obj.setName("Harsh");
        System.out.println(obj.getName());

    }
}