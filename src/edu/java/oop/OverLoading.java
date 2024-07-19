package edu.java.oop;

public class OverLoading {

    public static final double PI = 3.14;
    // 접근가능 - 공유가능 - 상수임 - 더블 자료형 - 이름은 파이
    private String type;


    public OverLoading(String type) {
        // 타입의 값을 매개변수로 받아서 초기화
        this.type = type;
    }


    public void  area() {
        System.out.println("Area of " + type);
        System.out.println("---넓이  구하기 ---");
    }

    // 메서드 오버로딩
    // 정사각형의 길이를 매개변수로 받아서 넓이를 계산하여 출력하는 에리어 메소드

    public void area(int lengthoftype) {
        System.out.println(lengthoftype*lengthoftype);
    }

//    public double area(int lenthoftype) {
//
//    }

    public double area(double radius) {
        return radius * radius * PI;
    }

    public double area(int base, int height)
    {
        return base * height / 2;
    }

    //  현재 객체를 종류나 문자열의 형태로 반환하는 메서드
    public String toString() {
        return "종류 :  " +  type  +  ", " + "dnjswndbf " + PI;
    }
}
