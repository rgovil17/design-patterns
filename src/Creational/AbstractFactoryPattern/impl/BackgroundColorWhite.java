package Creational.AbstractFactoryPattern.impl;

import Creational.AbstractFactoryPattern.interfaces.IBackgroundColor;

public class BackgroundColorWhite implements IBackgroundColor {
    @Override
    public String getBGColor() {
        return "White";
    }
}
