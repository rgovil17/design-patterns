package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        // Not allowed
        // Singleton singleton = new Singleton();

        Singleton instance1 = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(instance1));

        Singleton instance2 = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(instance2));
    }
}
