package AbstractFactoryPattern.impl;

import AbstractFactoryPattern.interfaces.ITextColor;

public class TextColorWhite implements ITextColor {
    @Override
    public String getTextColor() {
        return "White";
    }
}
