package TemplateMethodPattern.interfaces;

public abstract class CaffeinatedBeverage {

    // Template Method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        ready();
        System.out.println("\n---------\n");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public abstract void ready();

    public final void boilWater() {
        System.out.println("Boiling water...");
    }

    public final void pourInCup() {
        System.out.println("Pouring in cup...");
    }

    // Hook
    public boolean customerWantsCondiments() {
        return true;
    }
}
