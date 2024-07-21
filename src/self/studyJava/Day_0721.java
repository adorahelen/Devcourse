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
    }
}

