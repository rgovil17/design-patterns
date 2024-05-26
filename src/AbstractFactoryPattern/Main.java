package AbstractFactoryPattern;

import AbstractFactoryPattern.impl._DarkThemeFactory;
import AbstractFactoryPattern.impl._LightThemeFactory;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(new _DarkThemeFactory());
        System.out.println("Dark theme");
        System.out.println("Text Color: " + user1.getTextColor());
        System.out.println("Background Color: " + user1.getBackgroundColor());
        System.out.println("============");

        User user2 = new User(new _LightThemeFactory());
        System.out.println("Light theme");
        System.out.println("Text Color: " + user2.getTextColor());
        System.out.println("Background Color: " + user2.getBackgroundColor());
        System.out.println("============");
    }

}
