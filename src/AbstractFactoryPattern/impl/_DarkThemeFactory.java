package AbstractFactoryPattern.impl;

import AbstractFactoryPattern.interfaces.IBackgroundColor;
import AbstractFactoryPattern.interfaces.ITextColor;
import AbstractFactoryPattern.interfaces.IThemeFactory;

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
