package Creational.AbstractFactoryPattern.impl;

import Creational.AbstractFactoryPattern.interfaces.IBackgroundColor;

public class BackgroundColorBlack implements IBackgroundColor {
    @Override
    public String getBGColor() {
        return "Black";
    }
}
