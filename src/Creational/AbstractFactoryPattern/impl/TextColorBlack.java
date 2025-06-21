package Creational.AbstractFactoryPattern.impl;

import Creational.AbstractFactoryPattern.interfaces.ITextColor;

public class TextColorBlack implements ITextColor {
    @Override
    public String getTextColor() {
        return "Black";
    }
}
