package edu.java.oop.abst;

public abstract class animall {
    String name;
    String place;
    String food;
    String color;
    String size;

    // 추상 클래스 명시는 abstract
    // 속성추가

    // 기능 즉 행동 추가

    // 추상화 메소드는 클래스 내부에만 선언하고, 구현 하지 않지만 {} 괄호도 명시 안하는 약속

    public abstract void move();
    public abstract void eat();

    public  void sleep(){
        System.out.println("zZZZZZzZZZZZ");
    };
}
