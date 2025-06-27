package org.example.oop.game.app;

import org.example.oop.game.characters.GameCharacter;
import org.example.oop.game.characters.Mage;
import org.example.oop.game.characters.Rogue;
import org.example.oop.game.characters.Warrior;

import java.util.ArrayList;
import java.util.List;

public class GameMain {
    public static void main(String[] args) {
        System.out.println("--- Создание персонажей ---");
        // Создаем объекты разных подклассов, но используем ссылки суперкласса GameCharacter
        GameCharacter hero1 = new Warrior("Арес", 150, 10, "Двуручный Меч");
        Mage hero2 = new Mage("Мерлин", 80, 12, "Огненный Шар");
        GameCharacter hero3 = new Rogue("Тень", 100, 9, "Быстрый удар");
        GameCharacter hero4 = new GameCharacter("Гоблин", 55, 5);
        GameCharacter enemy1 = new Warrior("Орк", 70, 7, "Топор"); // Враг-воин

        System.out.println("\n--- Фаза атаки ---");
        // Теперь мы можем вызвать метод attack() на каждой ссылке GameCharacter.
        // JVM (во время выполнения) определит фактический тип объекта,
        // на который указывает ссылка, и вызовет соответствующую (переопределенную) реализацию attack().
        hero1.attack(); // Вызывает attack() из Warrior
        hero2.attack(); // Вызывает attack() из Mage
        hero3.attack(); // Вызывает attack() из Rogue
        hero4.attack(); // Вызывает attack() из GameCharacter (базовая атака)
        enemy1.attack();

        System.out.println("\n--- Персонажи в битве ---");
        // Мы можем хранить объекты разных типов в одной коллекции, если они имеют общий суперкласс
        List<GameCharacter> party = new ArrayList<>();
        party.add(hero1);
        party.add(hero2);
        party.add(hero3);
        party.add(hero4);
        party.add(enemy1);

        System.out.println("\n--- Атаки Мага (Полиморфизм времени компиляции - Перегрузка) ---");
        // Здесь мы демонстрируем перегрузку метода attack() для объекта Mage
        // Компилятор выбирает правильный метод на основе аргументов:

        hero2.attack(enemy1); // Вызывает Mage.attack(GameCharacter target)
        // Output: Мерлин нацеливает Огненный Шар на Гоблин!
        //         Гоблин получает 25 урона. Здоровье: 25

        hero2.attack(150);    // Вызывает Mage.attack(int spellPower)
        // Output: Мерлин выпускает усиленное заклинание Огненный Шар с силой 150!

        hero2.attack("Водный", 200); // Вызывает Mage.attack(String element, int spellPower)
        // Output: Мерлин призывает Водный магию с силой 200!

        // Пример, когда не можем использовать перегруженный метод, если ссылка не конкретного типа
        // GameCharacter genericMage = new Mage("Зигмунд", 90, 11, "Молния");
        // genericMage.attack(enemy2); // ОШИБКА КОМПИЛЯЦИИ: GameCharacter не имеет attack(GameCharacter target)
        // потому что перегруженный метод только в Mage.
        // Нужно приведение типа: ((Mage)genericMage).attack(enemy2);

        for (GameCharacter character : party) {
            System.out.print(character.getName() + ": ");
            character.attack();
            character.takeDamage(10);
            System.out.println("--------------------");
        }

        System.out.println("\n--- Специфические способности (требуется приведение типов) ---");
        // Если мы хотим вызвать метод, который НЕ определен в суперклассе,
        // нам нужно явно привести тип ссылки к типу подкласса.
        // Это пример, когда полиморфизм не применим напрямую.
        if (hero1 instanceof Warrior) { // Проверяем, является ли объект Воином
            Warrior warrior = (Warrior) hero1;
            warrior.block();
        }

        // Если мы хотим вызвать heal() для Мага, который находится в List<GameCharacter> party,
        // нужно приведение типа:
        for (GameCharacter character : party) {
            if (character instanceof Mage) {
                ((Mage) character).heal(); // Вызываем специфический метод Мага
            }
        }
    }
}
