package edu.java.oop;

public class InitialLization {

    int instanceField;
    static int staticField = 10000;

    {
        System.out.println("3. InitialLization");
    }

    static {
        System.out.println("1. 제일 먼저 실행 Static initialization block" +
                "메모리 상, 공유해서 사용하기에 ");
    }

    public InitialLization() {
        System.out.println("4.  constructor block ");
    }


    public static void main(String[] args) {
        System.out.println(staticField);
        // 인스턴스 필드의 값을 화면에 출력
        InitialLization Knagmin = new InitialLization();
        System.out.println(Knagmin.instanceField);
        // 스태틱 필드의 값을 화면에 추력


        System.out.println("2. 그 다음 메인 실행된다 main ( ) start  ");
        new InitialLization();
        // 기본 생성자 호출 - 참조변수 x


        // 기본 생성자 호출 - 참조변수 o
        System.out.println("5. main ( ) end ");




    }
}
