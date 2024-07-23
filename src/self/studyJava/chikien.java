package self.studyJava;

// 예외처리 코드 
class chikien {
    /*
    try {

    예외 발생 가능 코드 들

    } catch ( 예외클래스 e )

    {

    }
    finally   (이 친구는 항상 실행한다.)

    * */
    public class ExceptionisNotHard {
        public static void printLength(String data) {

            try {

                int result = data.length(); // 데이터가 0이다? 바로 널포인트 엑셉션 오류 발생함
                System.out.println("문자 수 : " + result);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                // 위에 처럼 에러 정보를 획득해도 괜찮고
//                System.out.println(e.toString());
//                e.printStackTrace(); // 3개다 동일한 방법임
            } finally {
                System.out.println("마무의리");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("프로그램 하지마루요");
        ExceptionisNotHard.printLength("This is a test");
        ExceptionisNotHard.printLength(null);
        System.out.println("프로그램 종료임");
    }

/*
다중 캐치문으로 여러 에러에 대응하는 것 역시 가능하다

처리해야 할 예외 클래스들이 상속 관계에 있을 때는 하위 클래스 캐치 블록을 먼저 작성하고
상위 클래스 캐치 블록을 나중에 작성해야 한다.
예외가 발생하면 캐치 블록은 위에서부터

예외 떠넘기기 throw
메소드 내부에서 예외가 발생 할 때 트라이 - 캐치 블록으로 예외를 처리하는 것이 기본이지만,
메소드를 호출한 곳으로 떠넘기기를 할 수 있다. 이때 사용하는 키워드가 throws 이다.

* */

    public void method1() {
        try {
            method2();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void method2() throws ClassNotFoundException {
        Class.forName("self.studyJava.ExceptionisNotHard");
        // 메소드 2 에서 에러를 처리하지 않고 떠넘겼기 때문에 이 메소드를 호출하는 메소드 1에서 이 예외를 받아 처리해야함
    }

    // 사용자 정의 예외
    // 통상 일반 예외는 Exception의 자식 클래스로 선언하고, 실행 예외는 런타임익셉션의 자식클래스로 선언한다.

    public class BirthDayException extends Exception {
        public BirthDayException() {}
        public BirthDayException(String message) {
            super(message);
        }
    }

}
