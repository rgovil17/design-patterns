package Creational.Prototype;

import Creational.Prototype.impl.Enemy;
import Creational.Prototype.impl.EnemyRegistry;

public class Main {
    public static void main(String[] args) {
        EnemyRegistry registry = new EnemyRegistry();

        // Register prototype enemies
        registry.register("flying", new Enemy("FlyingEnemy", 100, 12.0, false, "Laser"));
        registry.register("armored", new Enemy("ArmoredEnemy", 300, 6.0, true, "Cannon"));

        // Clone from registry
        Enemy e1 = registry.get("flying");
        Enemy e2 = registry.get("flying");
        e2.setHealth(80);   // maybe this one spawned with less HP

        Enemy e3 = registry.get("armored");

        // Print stats to verify
        e1.printStats();
        e2.printStats();
        e3.printStats();
    }
}
