package edu.java.oop.abst;

public abstract class animall {
    String name;
    String place;
    String food;
    String color;
    String size;

    public abstract void move();
    public abstract void eat();
    public void Shout() {
        System.out.println("소리 지르다. ");

    }
}
