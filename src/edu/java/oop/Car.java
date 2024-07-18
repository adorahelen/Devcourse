package edu.java.oop;

// maked Classs
public class Car {
    // + # ~ - 는 접근 제한자
    // 속성 상태 property, field

    public     String    Color = "Red";
    protected  boolean   SunRoof = true;
               int       price = 2000;
    private    String    maker = "Hyundai";
    //접근제한자  자료형      이름       할당값



    // 생성자 new ***호출


    // 기능, 동작,  behavior, method
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
    public void drive() {
        System.out.println("Car driving");
    }



}


