package edu.java.oop;

public class OverLoading {

    public static final double PI = 3.14;
    // 접근가능 - 공유가능 - 상수임 - 더블 자료형 - 이름은 파이
    // 스태틱으로 필드는 선언시 반드시 초기화 필요
    private String type;


    public OverLoading(String type) {
        // 타입의 값을 매개변수로 받아서 초기화
        this.type = type;
        // 공유 필드 == 스태틱은 => 모든 객체가 공유하기 때문에 각 생성자에서 개별적으로 초기화할 수 없다.
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



    // var args - 공유 메서드 sumAll () 오버로딩
    public static void sumAll () {
        System.out.println(" === All of sum ===");

    }

    // 정수 2개를 매개변수로 받아서 더한 후 에 반환하는 공유 메서드
    public static int sumAll(int x, int y) {
        return x + y;
    }

    public static int sumAll(int xx, int yy, int zz) {
        return xx + yy + zz;
    }

    // 정수 배열을 매개 변수로 받아서 더한 후 반환하는 공유 메서드
    public static int sumAll(int x[]) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
    // 매개변수 쪽에 똑같으면 문제가 생기니까
    public static double sumAll(double ... nums) {
        double sum = 0;
        for (double i : nums) {
            sum += i;
        }
        return sum;
    }
}
