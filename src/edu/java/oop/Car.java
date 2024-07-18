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
    public Car() {
        System.out.println("The car Created");
    }

    public Car(String maker) {
        this.maker = maker;
        System.out.println(maker + "The car Created");
    }


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


    public String toString() {
        return "Car 객체 : 색상- " + Color +
                " 썬루프 -" + SunRoof +
                "가격-" + price +
                "제조사-" + maker;
    }


    // 객체의 필드값을 저장하고 반환하는 셋터/게터 메서드
    //  priavte으로 선언된 객체의 필드값을 저장하고 반롼하는 getter and setter method
    //  Private String maker;
    public void setMaker(String maker) {
        this.maker = maker;
     } // private  으로 지정된 값을 바꾸기 위해서

    public String getMaker() {
        return maker;
    }
    // private 으로 선언된 것은
    // 객체에 다른 값을 넣을 수도 업고, 호출해서 출력할 수도 없다.
    // 이때 사용하는 것이 셋 그리고 겟인데
    // 셋은 값을 할당하는 거고 , 겟은 값을 받아옴




}


