package edu.java.oop;

public class Pizza {
    String name;
    int radius;

    Pizza (String name, int radius) {
        this.name = name;
        this.radius = radius;
    }
    // Pizza 객체 두 개를 매개변수로 받아서
    // 둘 중 라디우스가 더 큰 객체를 반환하는 공유 메서드  = 스태틱, 자료형 클래스
    public static Pizza getLargePizza(Pizza a, Pizza b) {
        return a.radius > b.radius ? a : b;
    }
    // 피자 객체 하나와, 정ㄱ수형 매개변ㄱ수 하나를 받아서
    // 라디우스가 20 미만이면 넘겨받은 매개변수 값으로 변경하는 클래스 메서드 = 스태틱, 자료형 보이드
    public static void makelargePizza(Pizza c, int size) {
        if (c.radius > 20) {c.radius = size;}
    }
    // 라디우스를 매개변수로 받아서 변경하는 인스턴스 메서드, (인스턴스 메서드 == 아무것도 안붙인다_)
    public void ChangeRadius(int radius) {
        this.radius = radius;
    }

    // command + N

//    double getLargePizza(Pizza radius, Pizza radius2) {
//        double MAX;
//        if (radius  radius2) {
//            MAX = radius2;
//
//        }
//
//    }

    // 모든 필드를 매개변수로 받아서 초기화하는 생성자
    // Pizza 객체 두 개를 매개변수로 받아서
        // 둘 중 Radius가 더 큰 객체를 받환하는 getLargePizza( ) 메서드를 반환 하시오

    // Pizza 객체 하나와, 정수형 매개 변수 하나를 받아서
    // radius가 20 미만이면 넘겨받은 매개변수 값으로 변경하는 클래스 메서드
    // MakeLargePizza ()
    // radius를 매개변수로 받아서 변경하는 인스턴스 메서드 ChangeRadius()
}
