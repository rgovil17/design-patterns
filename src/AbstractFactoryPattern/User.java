package AbstractFactoryPattern;

import AbstractFactoryPattern.interfaces.IBackgroundColor;
import AbstractFactoryPattern.interfaces.ITextColor;
import AbstractFactoryPattern.interfaces.IThemeFactory;

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
