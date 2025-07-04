package org.example.oop.zoo;

public class Snake extends Animal implements Reptile{
    private String species;

    public Snake(String name, String species) {
        super (name);
        this.species = species;
        System.out.println("Сшздана змея: '" + this.name + "' (вид: " + this.species + ").");
    }

    @Override
    public void eat() {
        System.out.println(name + " проглатывает своб добычу целиком.");
    }

    @Override
    public void shedSkin() {
        System.out.println(name + " сбрасывает старую кожу.");
    }

    @Override
    public void hasScales() {
        System.out.println(name + " имеет чешуйчатую кожу.");
    }
}
