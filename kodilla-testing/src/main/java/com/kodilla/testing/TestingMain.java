package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();


        int result1 = calculator.substractAFromB(9,6);

        if (result1 == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int result2 = calculator.addAToB(9,6);

        if (result2 == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}