package org.example.nonaccessmodifiers;

final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
// public class ColoredPoint extends ImmutablePoint { // ОШИБКА КОМПИЛЯЦИИ: cannot inherit from final class
