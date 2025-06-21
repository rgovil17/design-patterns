package Creational.AbstractFactoryPattern.impl;

import Creational.AbstractFactoryPattern.interfaces.IBackgroundColor;
import Creational.AbstractFactoryPattern.interfaces.ITextColor;
import Creational.AbstractFactoryPattern.interfaces.IThemeFactory;

public class _LightThemeFactory implements IThemeFactory {
    @Override
    public ITextColor createTextColor() {
        return new TextColorBlack();
    }

    @Override
    public IBackgroundColor createBGColor() {
        return new BackgroundColorWhite();
    }
}
