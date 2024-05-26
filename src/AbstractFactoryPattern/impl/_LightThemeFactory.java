package AbstractFactoryPattern.impl;

import AbstractFactoryPattern.interfaces.IBackgroundColor;
import AbstractFactoryPattern.interfaces.ITextColor;
import AbstractFactoryPattern.interfaces.IThemeFactory;

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
