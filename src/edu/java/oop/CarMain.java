package edu.java.oop;

public class CarMain {
    public static void main(String[] args) {

        int x; //  정수형 변수 선언 스택에 저장
        int[]i; // 정수형 배열 선언 힙으로 저장 (참조)

        // 생성이라는 키워드가 나오면 무조건 new
        Car redcar; // 1. 클래스 참조 변수 선언 (힙에 저장 * 그래서 참조 변수)
        redcar = new Car(); // 2. 객체 생성
        redcar.Color = "Blue"; // 객체의 필드 초기화 (접근 가능해짐 필드들에게 )
        redcar.SunRoof = false;
        redcar.price = 10000;

        System.out.println(redcar.Color);

        redcar.start();
        redcar.stop();





    }
}
