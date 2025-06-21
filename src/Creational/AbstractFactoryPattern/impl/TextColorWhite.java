package Creational.AbstractFactoryPattern.impl;

import Creational.AbstractFactoryPattern.interfaces.ITextColor;

public class TextColorWhite implements ITextColor {
    @Override
    public String getTextColor() {
        return "White";
    }
}
