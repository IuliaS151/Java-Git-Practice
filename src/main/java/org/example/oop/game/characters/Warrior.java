package org.example.oop.game.characters;

public class Warrior extends GameCharacter {
    private String weapon;

    public Warrior(String name, int health, int level, String weapon) {
        super(name, health, level);
        this.weapon = weapon;
        System.out.println(" - Воин: " + name + " с " + weapon);
    }

    @Override
    public void attack() {
        System.out.println(name + " атакует, размахивая своим " + weapon + "! Сильный удар!");
    }

    public void block() {
        System.out.println(name + " поднимает щит, блокируя удар!");
    }
}
