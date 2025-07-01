package Behavioral.TemplateMethodPattern;

import Behavioral.TemplateMethodPattern.impl.Coffee;
import Behavioral.TemplateMethodPattern.impl.Tea;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
