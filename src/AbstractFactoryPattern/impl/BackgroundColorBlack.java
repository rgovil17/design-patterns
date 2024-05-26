package AbstractFactoryPattern.impl;

import AbstractFactoryPattern.interfaces.IBackgroundColor;

public class BackgroundColorBlack implements IBackgroundColor {
    @Override
    public String getBGColor() {
        return "Black";
    }
}
