package self.studyJava;

public class Day_0720 {

    /*1. 자바의 정석 - 남궁성 - 서강대 005.133

    객체의 구성요소 - 속성과 기능
    속성 [ 맴버변수, 특성, 필드, 상태 ]
    기능 [ 메서드 , 함수 , 행위 ]

    프로그래밍언어에서 데이터 처리를 위한 데이터 저장형태의 발전과정은 다음과 같다.

    변수 - > 배열 -> 구조체 -> 클래스

    하나의 데이터를 저장
    같은 종류의 데이터를 하나의 집합으로 저장
    서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장
    데이터와 함수의 결합 ( 구조체 + 함수)

    즉 서로 관련된 변수들을 정의하고 이들에 대한 작업을 수행하는 함수들을
    함께 정의한 것이 바로 클래스이다.

    클래스 == 사용자정의 타입

    변수는 클래스 변수 , 인스턴스 변수 , 지역변수 모두 세 종류가 있다.



    * */



    /*
    2. 혼자 공부하는 자바 - 신용권 - 서강대 005.133

    클래스는 두 가지 용도가 있습니다. 하나는 라이브러리 API 용이고
    다른 하나는 실행용입니다.
    => 라이브러리 클래스는 다른 클래스에서 이용할 목적으로 설계됩니다.

    프로그램 전체에서 사용되는 클래스가 100개라면
    이중 99개는 라이브러리 클래스이고 단 하나가 실행 클래스입니다.

   => 실행 클래스는 프로그램 실행 진입점인  main()메소드를 제공하는 역할을 합니다.
    *
    * */
    // 아래와 같이 러이브러리인 동시에 실행 클래스로 만들 수도 있다.
    public static  class Student {
        int number;
        String name;
        String Dept;
        int age;

//        public Student(int number, String name, String Dept, int age) {
//            this.number = number;
//            this.name = name;
//            this.Dept = Dept;
//            this.age = age;
//        }

//        @Override
//        public String toString() {
//            return "Student{" +
//                    "number=" + number +
//                    ", name='" + name + '\'' +
//                    ", Dept='" + Dept + '\'' +
//                    ", age=" + age +
//                    '}';
//        // 생성자 안에 이건 선언 하는게 올바른지는 아직 모르겠음
//        }

        public static void main(String[] args) {
            Student st1 = new Student();
            // 생성자를 주석처리 하지 않으면 에러가 뜨는 이유는 무엇인가?
            // 매개변수만 있는 생성자를 만들었으니, 매개변수를 안넣으면 에러가 뜰 수 밖에 없다.
            // 따라서 생성자를 지정하지 않아 디폴트 생성자를 쓰거나 , 매개변수 없는 생성자를 하나 정의해라
            System.out.println(st1);
            Student st2 = new Student();
            System.out.println(st2);


        }

    }
}
