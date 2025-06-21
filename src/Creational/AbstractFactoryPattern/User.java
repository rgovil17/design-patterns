package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.interfaces.IBackgroundColor;
import Creational.AbstractFactoryPattern.interfaces.ITextColor;
import Creational.AbstractFactoryPattern.interfaces.IThemeFactory;

public class User {
    ITextColor textColor;
    IBackgroundColor backgroundColor;

    public User(IThemeFactory themeFactory) {
        this.textColor = themeFactory.createTextColor();
        this.backgroundColor = themeFactory.createBGColor();
    }

    public String getTextColor() {
        return this.textColor.getTextColor();
    }

    public String getBackgroundColor() {
        return this.backgroundColor.getBGColor();
    }
}
