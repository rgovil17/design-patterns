package AbstractFactoryPattern.interfaces;

public interface IThemeFactory {
    public ITextColor createTextColor();
    public IBackgroundColor createBGColor();
}
