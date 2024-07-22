package edu.java.oop;

class Outer {
    int i;

    class Member0 {
        public void method() {
            System.out.println("Outer method called");
        }
    }
    static class Static {
        public static void method() {
            System.out.println("Static's method called");
        }
    }
}
// 추상 메서드 method를 갖는 추상 클래스 Abstract
// 추상 메서드 method를 갖는 인터페이스 interface
abstract class Abstract {
    abstract void method();
}
interface Interface1 {
    void method();
}
class Abstractsub extends Abstract {
    @Override
    void method() {}
}
class InterpaceImple implements Interface1 {
    @Override
    public void method() {}
}


public class InnerClassMain {
    public static void main(String[] args) {
        // 추상 클래스 abstract를 구현하는 익명의 내부 클래스
        Abstract abs = new Abstract() {
            @Override
            void method() {
                System.out.println("추상 클래스를 익명의 내부 클랴스로 구현 ");
            }
//            class Abstractsub extends Abstract {
//                @Override
//                void method() {}
//            } 주석과 주석 밖이 동일함 // 추상화 클래스를 개빨리 사용하는 방법이
        };
        abs.method();
    // 추상 클래스 앱스트랙트를 구현하는 참조변수 없는 익명의 내부 클래스
        new Abstract() {
            @Override
            void method() {
                System.out.println("추상 클래스를 익명의 내부 클래스로 구현 2 ");
            }
        }.method();

        new Interface1(){
            @Override
            public void method() {
                System.out.println("인터페이스를 ");
            }
        };

        Outer outer = new Outer();

        Outer.Member0 member = outer.new Member0();
        member.method();


       Outer.Static.method();

    }

}
