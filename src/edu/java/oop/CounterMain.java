package edu.java.oop;

// Counter 클래스의 객체가 생성될 떄
// 참조 변수의 이름을 매개변수로 넘겨 받아서
// 인스턴스 필드 count 에 저장하고
// 생성된 인스턴스 누적 개수를
// 클래스 변수 인스턴스 넘에 저장한다
// 다음과 같이 출력되도록 처리
// 생성된 인스턴스의 이름 : ~~ 누적 인스턴스의 개수 : ~~~

class Counter {
    private String instanceName;
    private static int instanceNum; // this is first "0"
    // 객체 내부에서만 접근 가능해야 하니까, 필드 선언

    public  Counter( String instanceName) {
        this.instanceName = instanceName;
        instanceNum ++;
        System.out.println("생성된 인스턴스의 이름 : " + instanceName+
                "   누적 인스턴스의 개수" + instanceNum);
    }

//   static int instanceName = 0;
//    private static int count;
//
//     Counter (){
//
//        instanceName++;
    }


/////////////////////////////
public class CounterMain {
    public static void main(String[] args) {
        // 필요한 데이터를 전달하여
        // Counter 클래스 객체 c1, c2
        Counter c1= new Counter("괴인 1호");
        Counter c2= new Counter("괴인 2호");
        new Counter("괴인 3호");
//        Counter Car = new Counter();
//        System.out.println();

    }
}
