package self.studyJava;
/*1. 인터페이스
  2. 중첩클래스 (이너 클래스)
  * */
public class Day_0723 {

//    public interface Service {
//        default void defaultMethod1() {
//            System.out.println("default method 1 종속 코드");
//            defaultCommon();
//        }
//
//        default void defaultMethod2() {
//            System.out.println("default method 2 종속 코드");
//            defaultCommon();
//        }
//
//        private void defaultCommon() {
//            System.out.println("defaultMethod 중복 코드 A");
//            System.out.println("defaultMethod 중복 코드 B");
//        }
//    }
//    public static class ServiceImpl implements Service {}


    // 다중 인터페이스 구현
    // 구현 객체는, 여러 개의 인터페이스를 implements 할 수 있다.
    // 구현 객체가 인터페이스 A와 인터페이스 B를 구현하고 있다면
//    public class multygadekiru implements 인터페이스1, 인터페이스2 {}

    // 인터페이스1 변수 = 뉴 구현클래스명
    // 인터페이스2 변수 = 뉴 구현클래스명 에 따라서 호출할 수 있는 추상 메소드가 결정된다.
    // implements 하고 추상 메소드 오버라이딩
    public static void main(String[] args) {
        // 인터페이스도 상속 가능 / 클래스와는 달리 다중 상속 허용

        // 인터페이스 역시 다형성을 나타내며, 상속 보다 현업에서 더 많이 자주 사용된다.
        // => 사용 방법은 동일하지만 다양한 결과가 나오는 성질
        // 구현된 A객체와 B객체 중 어느 객체가 인터페이스에 대입되었느냐에 따라서 객체 A의 메소드 호출 결과는 달라진다.
        // { 다형성 = 메소드 재정의 + 자동타입 변환 }

        // 상속과 인터페이스는 같은 기능과 역할을 하고 인터페이스가 더 큰 집합(최신 문법? 기능)
        // Scanner.nextline 과 bufferstream 같은 느낌
        // 다르면 그때 수정하고 답습 해 나가면 된다.


//        Service runrun = new ServiceImpl();// 인터페이스 변수 선언과 구현 객체 대입
//
//        runrun.defaultMethod1();
//        System.out.println();
//        runrun.defaultMethod2();
//        System.out.println();

    }
}

/*중첩클래스 :
* 객체지향 프로그램에서는 클래스 간에 서로 긴밀한 관계를 맺고 상호작용한다.
* 클래스가 여러 클래스와 관계를 맺는 경우에는 독립적으로 선언하는 것이 좋으나,
* 특정 클래스만 관계를 맺을 경우에는 중접 클래스로 선언하는 것이 유지보수에 도움이 되는 경우가 많다.
*
* 클래스 내부에 클래스를 선언하는 것
*
* 클래스 선언 위치에 따라 맴버 클래스 (인스턴스 클래스 / 정적 클래스 )
* 그리고 메소드 내부에 선언되는 로컬 클래스로 나누어 진다.
*
*  + 중첩인터페이스도 결국 같은 맥락이고, 익명 클래스 익명 인터페이스 등등
* */

/*
* 라이브러리 ( 1.  lang => 2. Util => 3.
*
*  일단 모든 자바 모듈은 java.base (기본 모듈)에 의존한다.
* java.base 모듈은 requires 하지 않아도 사용할 수 있지만, 다른 모듈은 명시해야함 (import)
*  java.base 모듈이 포함하는 패키지들은
*       대표적으로 1. java.lang 2. java.util, 3. java.io 등 핵심 패키지가 소속해 있다.
* 이 중 자바 랭은 그냥 쓸 수 있고 다른 패키지들은 임폴트 해야하지만 *스캐너 쓰면 그냥 자동으로 임폴트 해줌
*
* 1. lang 패키지 실습 내용
* 1-1 예외처리 1-2 스트링 1-3 매쓰
*
* 예외에는 다음에 두가지 경우가 있다.
* 하나는 일반 예외 : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
* 둘째는 실행 예외 : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외를 말한다.
*
* => 자바는 예외가 발생하면 예외 클래스로부터 "객체"를 생성한다.
*  이 객체는 예외 처리 시 사용된다, 즉 자바의 모든 에러와 예외 클래스는
*  " Throwable "을 상속받아 만들어지고, 추가적으로 예외 클래스는
* "자바 . 랭 . 엑셉션 " 클래스를 상속받는다.
*
* */

