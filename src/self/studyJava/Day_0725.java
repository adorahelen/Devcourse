package self.studyJava;

//interface AIInterface { //인터페이스 하나 선언
//    void recognizeSpeach();
//    void synthesizeSpeach();
//}
interface PhoneInterface {// 인터페이스 하나 선언
    final int TIMEOUT = 10000; // 상수 필드 선언
    void sendCall(); // 추상 메소드 하나
    void receiveCall(); // 추상 메소드 둘
    default void printLogo(){ // 디폴트 메소드 하나
        System.out.println("** Phone **");
    }
}
interface MobileInterface extends PhoneInterface { // 인터페이스 상속 후 인터페이스 (뉴) 선언
    void sendMessage();
    void receiveMessage();
    // 인터페이스 는 일종의 추상 클래스로서 변수 맴버는 진짜로 가질 수 없다 .
}
interface MP3Interface { // 인터페이스 선언
    public void playMusic();
    public void playStop();
}
class PDA {
    public int calculate(int x, int y){
        return x + y;
    }
}

// 스마트폰 클래스는 피디에이를 상속받고, 인터페이스 1과 2에 선언된 추상 메소드를 모두 구현한다
class SmartPhone extends PDA implements MobileInterface, MP3Interface {


    @Override
    public void playMusic() {
        System.out.println("음악 연주");

    }

    @Override
    public void playStop() {
        System.out.println("음악 멈춰");

    }

    @Override
    public void sendMessage() {
        System.out.println("문자 갑니다");

    }

    @Override
    public void receiveMessage() {
        System.out.println("문자 왔어용");

    }

    @Override
    public void sendCall() {
        System.out.println("따르릉");

    }

    @Override
    public void receiveCall() {
        System.out.println("전화 왔어용");

    }
    // 메소드 추가
    public void schdeule() {
        System.out.println("일정 관리합니다.");
    }
}


public class Day_0725 {

    // 추상클래스는 객체를 생성할 수 없다.
    // 추상 클래스를 상속 받는 서브 클래스는 추상 클래스가 된다.
    // 추상 클래스의 추상 메소드를 그대로 상속받기 때문이다.
    // => 추상 클래스임을 명시해야 컴파일 오류가 발생하지 않는다.
    //  : 설계와 구현을 분리하기 위함 + 계층적 상속 관계 만들 때 적합

    // 인터페이스는 객체를 생성할 수 없다.
    // 인터페이스 타입의 레퍼런스 변수는 선언 가능하다
    // 인터페이스끼리 상속 가능
    // 인터페이스를 상속받아, 클래스를 작성하면 인터페이스의 모든 추상 메소드를 구현해야 한다.

    // 다중 인터페이스 예제
    public static void main(String[] args) {
        SmartPhone Phone = new SmartPhone();
        Phone.printLogo();
        Phone.playMusic();
        Phone.playStop();

        Phone.receiveCall();
        Phone.receiveMessage();
        Phone.receiveCall();
        Phone.receiveCall();
        System.out.println(Phone.calculate(10, 20));
        Phone.schdeule();

    }

    /* 제네릭과 컬렉션
    컬렉션은 안드로이드를 비롯한 자바 프로그램을 작성하는데 뺴놓을 수 없는 중요한 도구이다.
        : 또한 이 컬렉션은 "제네릭"이라는 기법으로 구현되어 있다.

        자바 . 유틸 패키지 안에
       1. 셋 : 집합 임  2. 리스트 (벡터도 리스트고 진화되기 전)(진화 후 어레이 리스트 / 링크드 리스트 )
       3. 맵 : (파이썬 딕셔너리임)

       Vector <E> & ArrayList<E> 는 가변 크기의 배열을 구현
       LinkedList <E> 는 노드들이 링크로 연결되는 리스트를 구현
       => 이들 모두 컬렉션 E 상속받고 , 단일 클래스의 객체만을 요소로 다룸

       당연히 해쉬맵은 키와 밸류 K 그리고 V 쌍으로 이루어지는 데이터를 저장하고 키로 검색하도록 만든 컬렉션

       여기있는 이 이 케이 뷔는 " 타입 매개 변수 "
       E 는 Integer / String / Long 등 어느 래퍼 객체 가능 그러나 일반화 ㄴㄴ 하려고 대문자 이 사용
       그니까 기본 자료형인 인트 차 더블 등은 불가능 무조건 객체만 가능 그래서 래퍼 클래스 객체 생성이 있는거임
       // 그러나 기본타입 값이 삽입되면 자동 방식에 의해 래퍼 클래스 타입으로 변환되어 객체로 저장된다
           * */
}
