package self.studyJava;

public class Day_0728 {
    // 재네릭이란 결정되지 않은 타입을 파라미터로 처리하고
    // 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능
    // == 추상클래스, 추상메소드 처럼 데이터 타입을 추상적으로 사용하게 하고 추후에 정의 하는 기능
    // 어떤 클래스가 정의될지 모르디만 추후에 구현하는 것 처럼,
    // 어떤 데이터 타입을 쓸지 모르지만 일단 짜고 추후에 명시 하게끔

    public static class Box<T> {
        public T contentl; // 파라미터로 티를 사용

        /* public class Box {  == <T> 괄호 티를 통해 "타입이 필요한 자리에 티를 사용하겠다 "
                public String content; == public T contentl 자료형을 티라고 사용하겠다

                // 티가 뭔지 모르지만, 박스 객체를 상생할 때 쯤 다른 어떤 타입을 사용할꺼다
        }
        * */
    }
    public static void main(String[] args) {
        // 위에서 재네릭을 명시했고, 아래에서 사용한다
        // Box<T> = Box<String> : 위에서 정의한 티를 스트링 타입으로 사용하겠다
        Box<String> box1 = new Box<>();
        box1.contentl = "hello";
        String str = box1.contentl;
        System.out.println(str);

        Box<Integer> box2 = new Box<>(); // 이번에는 인테자로
        // 명시할때 래퍼 클래스로 크게 크게 명시하고, +스트링은 에초부터 객체 (참조형이라서 그냥 그대로 쓴거임
        box2.contentl = 10;
        int int2 = box2.contentl;
        System.out.println(int2);
    }
}
