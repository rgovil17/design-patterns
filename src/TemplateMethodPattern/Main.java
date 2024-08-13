package TemplateMethodPattern;

import TemplateMethodPattern.impl.Coffee;
import TemplateMethodPattern.impl.Tea;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
