package edu.java.oop;

public class ElectricCarMain {
    public static void main(String[] args) {
        System.out.println("1. 타이어 만들기 --- --- --- > ");

        Tire t1 = new Tire("왼쪽 앞", "한국 타이어");
        Tire t2 = new Tire("왼쪽 뒤", "금호 타이어");
        Tire t3 = new Tire("오른쪽 앞", "삼성 타이어");
        Tire t4 = new Tire("오른쪽 뒤", "엘지 타이어");

        System.out.println("2. 전기차 만들기 - - -  ");
        ElectricCar Tesla = new ElectricCar(20000, t1, t2, t3, t4);


        System.out.println();
        System.out.println("3. 수소차 만들기 --- ---");
        t1 = new Tire("가운데 ", "미즈호 타이어");
        // Tire 객체 개수의 수와 관계없이 매개변수로 받아서 battery 용량과 함께 초기화하는 생성자
        ElectricCar Tesla2 = new ElectricCar(1000, t1);
    }
}
