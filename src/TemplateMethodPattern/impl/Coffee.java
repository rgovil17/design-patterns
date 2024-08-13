package TemplateMethodPattern.impl;

import TemplateMethodPattern.interfaces.CaffeinatedBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeinatedBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk...");
    }

    @Override
    public void ready() {
        System.out.println("Your coffee is ready!");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() { String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
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