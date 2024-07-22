package edu.java.oop.abst;

public class polyMain {
    public static void main(String[] args) {
       // animall a = new animall()
        human a = new human("asasd", "sada", "sad");
        Dolphin s = new Dolphin("asasd", "sada", "sad");

        System.out.println("업 캐스팅, 부모 = 자식 가능, 반대는 불가능, 가능해도 자식 고유 속성 사용 노");
        animall k = new Dolphin("asasd", "sada", "sad");
        k.move();
        k.eat();
        // 이렇게 쓸수도 있지만, 이런 방식으로는 상속을 시켜줄 수 있는것만 가져다 쓸 수 있ㄷ고
        // 고유 특성은 사용 못함 (돌핀 소닉 브레이크, 휴먼 파워 등)
        k = new Dolphin("asasd", "sada", "sad");
        k.move();

        // 다운 캐스팅 : 자식 = 부모
//        human hu = (human)new animall();

        Parent p = new Parent();
                p = new Child();
//        Child c = (Child)new Parent();
//                c.method();

    }
}

class Parent {
    public void method() {
        System.out.println("ddddddddddd");
    }
}
class Child extends Parent {
    public void method() {
        System.out.println("ssssssssssss");
    }
}