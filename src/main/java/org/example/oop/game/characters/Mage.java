package org.example.oop.game.characters;

public class Mage extends GameCharacter{
    private String spell;

    public Mage(String name, int health, int level, String spell) {
        super(name, health, level);
        this.spell = spell;
        System.out.println(" - Маг: " + name + " с заклинанием " + spell);
    }

    @Override
    public void attack() {
        System.out.println(name + " кастует " + spell + "! Магический взрыв!");
    }

    // --- Полиморфизм времени компиляции (Перегрузка) ---

    // Перегруженный метод: атака по конкретной цели
    public void attack(GameCharacter target) {
        if (target != null) {
            System.out.println(name + " нацеливает " + spell + " на " + target.getName());
            target.takeDamage(25);
        } else {
            System.out.println(name + " пытается атаковать воздух. Цель не найдена.");
        }
    }

    public void attack(int spellPower) {
        System.out.println(name + " выпускает усиленное заклинание " + spell + " с силой " + spellPower);
    }

    // Перегруженный метод: атака с использованием элемента и силы
    public void attack(String element, int spellPower) {
        System.out.println(name + " призывает " + element + " магию с силой " + spellPower + "!");
    }

    public void heal() {
        System.out.println(name + " исцеляет себя, восстанавливая здоровье.");
    }
}
