package Creational.Prototype.impl;

import Creational.Prototype.interfaces.EnemyPrototype;

public class Enemy implements EnemyPrototype {
    private String type;
    private int health;
    private double speed;
    private boolean armored;
    private String weapon;

    public Enemy(String type, int health, double speed, boolean armored, String weapon) {
        this.type = type;
        this.health = health;
        this.speed = speed;
        this.armored = armored;
        this.weapon = weapon;
    }

    @Override
    public Enemy clone() {
        return new Enemy(type, health, speed, armored, weapon);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void printStats() {
        System.out.println("Enemy{" +
                "type='" + type + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                ", armored=" + armored +
                ", weapon='" + weapon + '\'' +
                '}');
    }
}
