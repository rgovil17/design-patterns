package Creational.AbstractFactoryPattern.impl;

import Creational.AbstractFactoryPattern.interfaces.IBackgroundColor;
import Creational.AbstractFactoryPattern.interfaces.ITextColor;
import Creational.AbstractFactoryPattern.interfaces.IThemeFactory;

public class _DarkThemeFactory implements IThemeFactory {
    @Override
    public ITextColor createTextColor() {
        return new TextColorWhite();
    }

    @Override
    public IBackgroundColor createBGColor() {
        return new BackgroundColorBlack();
    }
}
