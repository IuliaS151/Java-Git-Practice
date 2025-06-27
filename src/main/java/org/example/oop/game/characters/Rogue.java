package org.example.oop.game.characters;

public class Rogue extends GameCharacter {
    private String specialAbility;

    public Rogue(String name, int health, int level, String specialAbility) {
        super(name, health, level);
        this.specialAbility = specialAbility;
        System.out.println("  - Разбойник: " + name + " со способностью " + specialAbility);
    }

    @Override
    public  void attack() {
        System.out.println(name + " использует " + specialAbility + " для скрытой атаки!");
    }

    public void sneak() {
        System.out.println(name + " скрывается в тени.");
    }
}
