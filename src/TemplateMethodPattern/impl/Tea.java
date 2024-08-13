package TemplateMethodPattern.impl;

import TemplateMethodPattern.interfaces.CaffeinatedBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeinatedBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon...");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    @Override
    public void ready() {
        System.out.println("Your tea is ready!");
    }

    private String getUserInput() { String answer = null;
        System.out.print("Would you like lemon with your tea (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}