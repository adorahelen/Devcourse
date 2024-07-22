package edu.java.oop;

public class Tire {
    public String maker;
    public String position;

    public Tire(String position, String maker) {
        this.position = position;
        this.maker = maker;
    }
    public void attachTire() {
        System.out.println(position + " is attached to " + maker);
    }
}
