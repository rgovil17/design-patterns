package Creational.SingletonPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Singleton instance created!");
            instance = new Singleton();
        }
        return instance;
    }
}
