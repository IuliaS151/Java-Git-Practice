package org.example.oop.game.characters;

public class GameCharacter {
    protected String name;
    protected int health;
    protected int level;

    public GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
        System.out.println("Создан персонаж: " + name + " (Уровень: " + level + ", Здоровье: " + health + ")");
    }

    public void attack() {
        System.out.println(name + " выполняет базовую атаку.");
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " получает " + damage + " урона. Здоровье: " + health);
        if (this.health <= 0) {
            System.out.println(name + " повержен.");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
