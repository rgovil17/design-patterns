package AbstractFactoryPattern.impl;

import AbstractFactoryPattern.interfaces.IBackgroundColor;

public class BackgroundColorWhite implements IBackgroundColor {
    @Override
    public String getBGColor() {
        return "White";
    }
}
