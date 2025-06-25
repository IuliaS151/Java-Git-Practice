package org.example.nonaccessmodifiers;

class Constants {
    public static final double PI = 3.14159;
    public final String VERSION_NAME = "1.0";
}

class Parent {
    public final void cantOverrideMe() {// final method
        System.out.println("This method cannot be overridden.");
    }
    public void canOverrideMe() {
        System.out.println("THis method can be overridden.");
    }
}

class Child extends Parent {
    // @Override // ОШИБКА КОМПИЛЯЦИИ: cannot override final method
    // public void cantOverrideMe() {
    //     System.out.println("Trying to override...");
    // }
    @Override
    public void canOverrideMe() {
        System.out.println("Child's overridden method.");
    }
}

public class FinalForMethodsAndFields {
}
