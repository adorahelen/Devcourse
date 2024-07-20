package self.studyJava;

public class Day_0720 {
    public static void main(String[] args) {

//    }
//
//    /*1. 자바의 정석 - 남궁성 - 서강대 005.133
//
//    객체의 구성요소 - 속성과 기능
//    속성 [ 맴버변수, 특성, 필드, 상태 ]
//    기능 [ 메서드 , 함수 , 행위 ]
//
//    프로그래밍언어에서 데이터 처리를 위한 데이터 저장형태의 발전과정은 다음과 같다.
//
//    변수 - > 배열 -> 구조체 -> 클래스
//
//    하나의 데이터를 저장
//    같은 종류의 데이터를 하나의 집합으로 저장
//    서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장
//    데이터와 함수의 결합 ( 구조체 + 함수)
//
//    즉 서로 관련된 변수들을 정의하고 이들에 대한 작업을 수행하는 함수들을
//    함께 정의한 것이 바로 클래스이다.
//
//    클래스 == 사용자정의 타입
//
//    변수는 클래스 변수 , 인스턴스 변수 , 지역변수 모두 세 종류가 있다.
//
//
//
//    * */
//
//
//
//    /*
//    2. 혼자 공부하는 자바 - 신용권 - 서강대 005.133
//
//    클래스는 두 가지 용도가 있습니다. 하나는 라이브러리 API 용이고
//    다른 하나는 실행용입니다.
//    => 라이브러리 클래스는 다른 클래스에서 이용할 목적으로 설계됩니다.
//
//    프로그램 전체에서 사용되는 클래스가 100개라면
//    이중 99개는 라이브러리 클래스이고 단 하나가 실행 클래스입니다.
//
//   => 실행 클래스는 프로그램 실행 진입점인  main()메소드를 제공하는 역할을 합니다.
//    *
//    * */
//    // 아래와 같이 러이브러리인 동시에 실행 클래스로 만들 수도 있다.
//    public static  class Student {
//        int number;
//        String name;
//        String Dept;
//        int age;
//
////        public Student(int number, String name, String Dept, int age) {
////            this.number = number;
////            this.name = name;
////            this.Dept = Dept;
////            this.age = age;
////        }
//
////        @Override
////        public String toString() {
////            return "Student{" +
////                    "number=" + number +
////                    ", name='" + name + '\'' +
////                    ", Dept='" + Dept + '\'' +
////                    ", age=" + age +
////                    '}';
////        // 생성자 안에 이건 선언 하는게 올바른지는 아직 모르겠음
////        }
//
//        // 객체 내부에서 메서드 호출
//        public class ClassName {
//            public ClassName() {
//            }
//
//            void method1(String p1, int p2) {
//
//            }
//
//            void method2(String p1, int p2) {
//                method1("홍길동이", 100);
//            }
//
//            // 아 이런식으로 내부에서 호출하는 방법 그러면 아무리 길어져도 괜찮지
//
//            // 외부에서 호출하는 방식은 아래가 아니라 클래스 파일을 두개 만들어서 진행하는거
//            // 클래스 컴파일 할때 아마 하나의 클래스 파일에 클래스 여러개 있으면 중복으로 문제 뜸???
//
////            public static void main(String[] args) {
////                ClassName Outside = new ClassName();
////                Outside.method2("김강민이", 179);
////            }
//        }
//
//
////            Student st1 = new Student();
////            // 생성자를 주석처리 하지 않으면 에러가 뜨는 이유는 무엇인가?
////            // 매개변수만 있는 생성자를 만들었으니, 매개변수를 안넣으면 에러가 뜰 수 밖에 없다.
////            // 따라서 생성자를 지정하지 않아 디폴트 생성자를 쓰거나 , 매개변수 없는 생성자를 하나 정의해라
////            System.out.println(st1);
////            Student st2 = new Student();
////            System.out.println(st2);
//
//

        /* 03. 이것이 자바다 - 신용권, 임경균
        => 대출 8월 19일까지

        ----------              ----------
        데이터 타입에는 기본 타입과 참조 타입이 있다.
       => 참조 타입
       1. 배열    2. 클래스  3. 인터페이스    4. 열거 타입
       *기본형과 차이 : 기본 타입으로 선언된 변수는 값을 저장하고  = > 스택 영역에 값이 그대로 저장 됨
                     참조 타입은 선언된 변수는 번지를 저장한다. => 주소만 저장 (값은 힙 영역에 있음)

       * 참조타입은 주소를 저장하는 만큼, Null 값을 가질 수 있다.
       * 어떤 변수에서도 객체를 참조하지 않으면 해당 객체는 프로그램에서 사용할 수 없는 객체가 된다.
        => 힙 메모리에는있지만, 위치 정보를 모르기 때문에 사용할 수 없게 된다.
        => 자바는 이러한 객체를 쓰레기로 취급하고 가비지 콜렉터로 자동 삭제함
        =>=> 그래도 그 객체의 모든 참조를 없애야 가비지 콜렉터가 작동함

       JVM 에서 사용되는 매모리 영역
       1. 메소드 영역
       상수, 정적필드, 메소드 코드, 생성자 코드
       = 바이트코드 파일을 읽은 내용이 저장되는 영역

       2. 힙 영역
       객체1, 객체2, 객체3, 배열1, 배열2, 배열3
       = 객체가 생성되는 영역

       3. 스택 영역 (스레드)
       변수1, 변수2, 변수3
        = 메소드를 호출할 때마다 생성되는 프레임이 저장되는 영역 (주소가 저장되는)

        *
        * */

//        String name1 = "김강민";
//        String name2= new String("김강민");
//        System.out.println(name1.equals(name2));
//        System.out.println(name1 == name2);

        /*
         *      6. 객체지향 프로그래밍
         *      객체란?
         *      객체의 상호작용
         *      객체 간의 관계 [ 집합 / 사용 / 상속 ]
         *  집합 : 자동차 클래스 안에 엔진 + 타이어 + 핸들
         *  사용 : 다른 객체의 필드를 읽고 변경하거나, 메소드를 호출하는 관계
         *  상속 : 부모와 자식 관계 ( 자동차가 "기계" 의 특징인 필드와 메소드를 물려 받음)
         *
         *
         * 클래스 선언시 하나의 소스 파일에 여러개의 클래스를 작성 x
         * 가능은 하지만, 어차피 컴파일하면 클래스 만큼 바이트파일이 생성되고
         * 소스 파일명과 동일한 클래스만 public class가 되기 때문이다.
         *
         *
         * 클래스의 두가지 용도
         * 1. 라이브러리 : 실행할 수 없으며, 다른 클래스에서 이용하는 클래스
         * 2. 실행 : main() 메소드를 가지고 있는 실행 가능한 클래스
         * => 자바 프로그램
         *  { 하나의 실행 클래스 + 복수의 라이브러리 클래스
         *      => 실행 클래스는 실행 하면서 라이브러리 클래스를 내부에서 이용한다. }
         *
         *
         * 클래스의 구성 맴버
         * 필드 : 객체의 데이터가 저장되는 곳 int fieldName
         * 생성자 : 객체 생성시 초기화 역할 담당 CalssName() {}
         * 메소드 : 객체의 동작으로 호출 시 실행하는 블록 int methodName(String "A") { ... }
         *
         * 객체의 내부에 있는 함수를 메소드 / 외부에 있는 함수는 그냥 함수?_!
         *
         * 객체 내부에 있는 필드(변수)들은 자동으로 초기화된다. (지역변수랑은 다르게 자동으로 0 이나 널로)
         *
         * 객체 내부에서는 단순히 필드명으로 필드를 읽고 변경 할 수 있지만,
         * 객체 외부에서는 참조 변수와 . 도트 연산자를 이용해서 접근해야한다.
         *  그리고 아마 private 가 붙은 경우에는 저것도 안되서 getter()/setter()써야 함
         *
         * 생성자 선언과 호출
        * */

        //필드 초기화
        class Korean {

            private static Korean instance; // 싱글톤 을 위한 변수랍니다

            String nation = "Republic of the Super Power Korea";
            String name;
            String ssn; // ju min bun ho

            private Korean (String n, String s){
                this.name = n;
                this.ssn = s;
                // 한국인이니까 저건 동일해서 지정
                // 이름과 주민등록번호는 모두 다르니까 객체 생성시 할당해서 생성시키기
            }




            // Public method to provide access to the single instance
            public static Korean getInstance(String name, String ssn) {
                if (instance == null) {
                    instance = new Korean(name, ssn);
                }
                else {
                    instance.name = name;
                    instance.ssn = ssn;
                }
                return instance;
            }

            // Getters and setters for name and ssn
            public String getName() {
                return name;
            }

            public String getSsn() {
                return ssn;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setSsn(String ssn) {
                this.ssn = ssn;
            }




        }


//        Korean Person1 = new Korean("나루토", "010-1234-5678"); // 아 이거 주민번호지
//        Korean Person2 = new Korean("사스케", "010-1234-5678");
//        System.out.println(Person1.nation);
//        System.out.println(Person1.name);
//        System.out.println(Person1.ssn);
//        System.out.println(Person2.nation);
//        System.out.println(Person2.name);
//        System.out.println(Person2.ssn);
//        System.out.println(Person1);
//        System.out.println(Person2);
        //self.studyJava.Day_0720$1Korean@5acf9800
        //self.studyJava.Day_0720$1Korean@4617c264
        // 이거 싱글톤으로 만들면, 두개 시리얼 넘버가 동일하게 출력될까 궁금한데

//        Korean person1 = Korean.getInstance("나루토", "010-1234-5678");
//        Korean person2 = Korean.getInstance("사스케", "010-8765-4321");
//        System.out.println(person1);
//        System.out.println(person2);
        //self.studyJava.Day_0720$1Korean@5acf9800
        //self.studyJava.Day_0720$1Korean@5acf9800

//        System.out.println(person1.name);
//        System.out.println(person1.ssn);
//        System.out.println(person2.name);
//        System.out.println(person2.ssn);

        //self.studyJava.Day_0720$1Korean@5acf9800
        //self.studyJava.Day_0720$1Korean@5acf9800
        //나루토
        //010-1234-5678
        //나루토
        //010-1234-5678
        // 이거 해결을 위해서 필요한 것이 이제 게터 세터 함수겠네
        Korean person1 = Korean.getInstance("나루토", "010-1234-5678");
        System.out.println("person1: " + person1.getName());
        System.out.println("person1: " + person1.getSsn());

        Korean person2 = Korean.getInstance("사스케", "010-8765-4321");

        System.out.println("person1: " + person1.getName());
        System.out.println("person1: " + person1.getSsn());

        System.out.println("person2: " + person2.getName());
        System.out.println("person2: " + person2.getSsn());




     }

}

