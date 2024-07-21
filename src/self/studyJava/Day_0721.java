package self.studyJava;

public class Day_0721 {
    String model;
    String Color;
    int a;
    int b;
    int c;

    //생성자 오버로딩 (아래 전 부)
    Day_0721() {}
    Day_0721(int a, int b, int c) {}
    Day_0721(String model, String Color){}
    // 생성자 오버로딩 => 매개변수의 타입, 개수, 순서가 다르게 여러 개의 생성자 선언
    Day_0721(String model, String Color, int a, int b, int c){
        this.model = model;
        this.Color = Color;
        this.a = a;
        this.b = b;
        this.c = c;

    }


    // 아무튼 이런식으로 생성자 오버로딩이 많아질 경우
    // 생성자 간의 중복된 코드가 발생할 수 있다.

    public static void main(String[] args) {
        Day_0721 day = new Day_0721();
        Day_0721 day2 = new Day_0721(2, 2, 2);
        Day_0721 day3 = new Day_0721(3, 3, 3);

    // 메소드 오버로딩



    }
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }
    double plus(double x, double y) {
        double result = x + y;
        return x + y;
    }
    // 대표적인 메소드 오버로딩 예시는 콘솔에 출력하는 System.out.println()

    // 필드와 메소드는 선언 방법에 따라 인스턴스 맴버와 정적 맴버로 분류된다.
    // 인스턴스 맴버로 선언되면 객체 생성 이후 사용 가능하고
    // 정적 맴버로 선언되면 객체 생성 없이도 사용 가능하다. (static == 정적)
    public class Car {
        int gas; // this is instance filed
        void setGas(int gas) {} // this is instance method too
    }
    // 상기에 나열된 가스 필드와 셋 가스 메소드는 인스턴스 맴버이기 때문에
    // 외부 클래스에서 이를 사용하기 위해서는 객체를 생성하고 참조 변수로 접근해서 사용해야 한다.
    // 즉 프라이빗이 붙지 않아도 스태틱없으면 인스턴스 맴버다

    // 다시 이, 인스턴스 맴버란 객체에 소속된 맴버를 뜻한다.
    // 따라서 객체가 있어야만 사용할 수 있는 맴버다.

    // 객체 내부에서는 인스턴스 맴버에 접근하기 위해 this를 사용할 수 있다.

    // 정적 맴버란?
    public class RealSum {
        static int first;
        static int second(int a, int b){
            return (a+b)/2;
        }
    } // 클래스 안에 선언된 정적 필드와, 정적 메소드


}

