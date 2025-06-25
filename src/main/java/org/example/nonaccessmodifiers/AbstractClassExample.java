package org.example.nonaccessmodifiers;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Абстрактный метод (без тела)
    public abstract double getArea(); //  Подклассы ОБЯЗАНЫ реализовать этот метод

    // Конкретный метод (с телом)
    public void displayInfo() {
        System.out.println("Thia is a " + color + " shape.");
    }
}
// Конкретный подкласс Circle, который реализует абстрактный метод
class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        // Shape s = new Shape("Red"); // ОГИБКА КОМПИЛЯЦИИ: Shape is abstract; cannot be instantiated

        Circle myCircle = new Circle("Blue", 5.0);
        myCircle.displayInfo(); // This is a Blue shape.
        System.out.println("Circle area: " + myCircle.getArea()); // Circle area: 78.539...
    }
}
