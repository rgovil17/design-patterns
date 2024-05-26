package AbstractFactoryPattern.impl;

import AbstractFactoryPattern.interfaces.ITextColor;

public class TextColorBlack implements ITextColor {
    @Override
    public String getTextColor() {
        return "Black";
    }
}
