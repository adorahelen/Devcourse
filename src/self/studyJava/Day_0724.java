package self.studyJava;

import java.util.StringTokenizer;

public class Day_0724 {

    /*
    * SQL, 래퍼클래스와 박싱 언박싱,
    *
    * 릴레이션의 특징
    * - 중복 레코드 존재 불가능 : 도메인 무결성
    * 레코드 순서는 무의미하다.
    * 컬럼의 순서는 무의미하나.
    *
    * 컬럼의 원자성 == 모든 값들은 나눌 수 없는 하나의 의미만을 가진다.
    *
    * DDL == 데이터 정의 Created, Alter, Drop
    * DML == Mannipulation Insert, UpDate, Delete
    * DCL == Data Control Language : Grant, Revoke
    *
    * +
    *  TCL : 트랜잭션 컨트롤 랭귀지
    * = 데이터 조작 결과를 작업 단위인 트랜잭션 별로 제어하는 명령어 집합
    * SQL 들을 묶어서 하나의 작업처럼 처리
    *
    * 무결성 유지 되었다? =>  Commit
    * 문제가 발생 되었다? => Rollback
    *
    *
    *
    * */
//int radius;
//String name;
//
//    public static void main(String[] args) {
//        Day_0724 pizza; // 클래스 객체에 대한 레퍼런스 변수 피자 선언
//        pizza = new Day_0724(); // 클래스 객체 생성 (참조 변수=레퍼런스 변수 피자 선언)
//
//        pizza.radius = 10; // 라디우스 필드에 10 저장
//        pizza.name = "자바 피자"; // 네임 필드에 자바피자 저장
//        double area = pizza.getArea();
//        System.out.println(area);
//    }
//
//    private double getArea() {
//        return radius * radius * Math.PI;
//    }

// 레퍼런스 변수 선언 : 객체를 생성하기 전, 객체를 가리킬 레퍼런스 변수를 먼저 선언한다.
    // 클래스 변수 = new 클래스 ()
    // 클래스의 참조변수 선언 + 생성자를 통한 객체 생성 -> 객체의 주소를 가진 참조변수
    // 이 참조변수를 가지고 여러가지 진행

    // 패키지는 랭, 유틸, 아이오
    // 이중 랭 패키지에 속한 오브젝트 클래스는 모든 클래스에 강제로 상속된다.
    // 최상위 클래스이며, object obj = new Object();
    // 따라서 아래와 같이 보이지 않는 클래스에 간접 연산자를 써서 함수를 호출 한다.
    // 대표적으로 투 스트링 이 있고, 이걸 오버라이딩 해서 사용
    //



//    public  String toSting() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
//
//    public static void main(String[] args) {
//      }

    /*
    *  이름이 Wrapper 인 클래스는 존재하지 않는다.
    * 다만 기본 자료형을 객체로 다루기 위해 JDK 에 만들어진 8개의 클래스를 통칭하여 그리 부른다.
    * Byte
    * Short
    * Integer
    * Long
    * Character
    * Double
    * Float
    * Boolean 등
     대문자로 쓰면 래퍼 클래스 <=> 소문자로 쓰면 기본 자료형
     *
     * 그래서 이건 왜 만들었냐?
     * => 자바의 어떤 클래스들은 객체만을 다루기 때문에
     * 기본 타입의 데이터를 사용할 수 없는 경우가 존재한다.
     * 따라서 이런 문제점을 해결하기 위해서 기본 타입의 값을 객체로 만들어 사용하도록
     * 래패 클래스를 제공한다. 이러한 래퍼 클래스들은 자바 랭 패키지에서 제공한다.
    * */
    Integer i = Integer.valueOf(10); // 정수 10의 객체화 진행
    Double d = Double.valueOf(10.0); // 실수 10.0의 객체화 진행
    Boolean b = Boolean.valueOf(true);
    // Char 를 제외한 나머지 들은  문자열로 래퍼 객체 생성 가능, 바이트, 쇼트,롱,차,플롯 등
    Integer ii = Integer.valueOf("10"); // 정수 10의 객체화 진행
    Double dd = Double.valueOf("10.0"); // 실수 10.0의 객체화 진행
    Boolean bb = Boolean.valueOf("true");

    // 래퍼 클래스의 제공하는 다양한 메서드들 존재함 너무 많아서 생략 { ... }

    // 박싱 개념과 언박싱 개념
    // 기본 타입의 값을 래퍼 객체로 변환하는 것을 박싱이라고 부르고
    // 반대의 경우를 언 박싱 이라고 부른다
    Integer iii = 10; // 자동 박싱
    int n = iii; // 자동 언박싱


    // 자바 랭 패키지에 포함된 클래스로 스트링 클래스는 문자열
//    String();
//    String(char[] value);
//    String(String original);
//    String(StringBuffer buffer);



//    public static void main(String[] args) {
//        String s = new String("Hello");
//        String t = s.concat("java");
//        System.out.println(s); // Hello만 출력댐을 알 수 있다.
//        s = s.concat(" JAVA");
//        System.out.println(s);
//        // 스트링 클래스 안에 있는 메소드 활용
//
//
//    }

//    public class StringBufferEX {
//        public static void main(String[] args) {
//            StringBuffer sb;
//            sb = new StringBuffer("THIS");
//            sb.append(" is pencil");
//            System.out.println(sb);
//
//            sb.insert(7, " my");
//            System.out.println(sb);
//
//            sb.replace(8, 10, "your");
//            System.out.println(sb);
//
//            sb.delete(8, 13);
//            System.out.println(sb);
        //}
public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");

    while (st.hasMoreTokens())
        System.out.println(st.nextToken());
}

    }


