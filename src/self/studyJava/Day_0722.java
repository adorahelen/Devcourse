package self.studyJava;

public class Day_0722 {
    /*
    * 1. 접근 제한자
    * : 경우에 따라서 객체의 필드를 외부에서 변경하거나 ,
    * 메소드를 호출 할 수 없도록 막아야 할 필요가 있다.
    *  => 객체의 무결성 유지 (중요한 필드와 메소드가 외부로 노출되지 않도록)
    *
    * 캡슐화 개념의 일종이며,
    * 외부 객체 ======>     노출메소드 (호출가능) + (읽기 쓰기 가능)
    *                     숨긴필드, 숨긴메소드 (읽기 쓰기 불가능, 호출 불가능)
    *
    * (아래로 내려갈 수록, 접근제한이 강화된다.)
    * public                                없음
    * protected                             같은 패키지 || 자식 객체
    * default *이건 접근제한자가 붙지 않은 상태  : 제한 범위는 같은 패키지
    * private                                객체 내부
    *
    *==> 클래스를 선언할 때 public 접근 제한자 생략하면 디폴트가 되고 다흔 패키지에선 사용 못함
    *
    *
    * Getter & Setter
    * 객체의 필드 (데이터)를 외부에서 마음대로 읽고 변경할 경우
    * 객체의 무결성이 깨진다.
    * 그래서 객체지향 프로그래밍에서는 직접적입 필드 접근( 대입 연산자 사용)을 막고
    * 메소드를 통해 필드에 접근하게 한다.
    * => 이유 : 메소드를 통해 데이터를 검증할 수 있고 유효한 값만 저장시키는게 가능해서
    *
    * */
//        private  double speed;
//        public void setSpeed(double speed) {
//            if (speed < 0) {
//                this.speed = 0;
//                return;
//            }else {
//                this.speed = speed;
//            }// 이렇듯 매개값이 음수일 경우 0을 저장시킬 수 있다.
//
//            //외부에서 객체의 필드를 읽을 때에도 메소드가 필요한 경우가 있다.
//            // 필드값이 객체 외부에서 사용하기에 부적절한 경우,
//            // 메소드를 통해 적절한 값으로 변환한 다음 리턴할 수 있기 때문이다.
//            // 이러한 역할을 하는 메소드가 getter이다.
//        }
//        private double speeed2;
//        public double getSpeed2() {
//            double km = speed * 1.6;
//            return km;
//    }// 외부에서 읽지 못하는 speed필드를 읽어서 변환시키고 외부로 리턴
//
//        private String fieldName;
//
//        public String getFieldName() {
//            return fieldName;
//        }
//        public void setFieldName(String fieldName) {
//            this.fieldName = fieldName;
//        }
//
//        private boolean stop;
//
//        public boolean isStop() {// 불리안 타입은 0또는1로 반환 할 것
//            return stop;
//        }
//
//    public double getSpeed() {
//        return speed;
//    }
//
//    public double getSpeeed2() {
//        return speeed2;
//    }
    // 싱글톤 복습
    // 핵심은 생성자를 private 접근 제한해 외부에서 new 연산자로 생성자를 호출 못하게 하는 것

    /*
    * 상속은 말 그대로 부모가 자식에게 물려주는 행위를 말한다.
    * 객체지향 프로그램에서도 부모 클래스의 필드와 메소드를 자식 클래스에게 물려줄 수 있다.
    *
    * => 이미 개발된 클래스를 재사용해서 중복성 감소, 개발시간 단축
    *
    * 다른 언어와 달리 자바는 다중 상속을 허용하지 않는다, (인터페이스는 가능)
    * // 자식 객체를 생성하면, 부모 객체가 먼저 생성된 다음에 자식 객체가 생성된다.
    * // => 자식 생성자 선언 시, (디폴트 생성자 마냥, 부모 생성자가 숨어 있음)
    *   super() == 부모 생성자인데 숨어있다가 자동으로 호춯된다함
    * */

    static class Phone{
        String model;
        String color;
//        Phone(){
//            System.out.println("Phone() 생성자 실행 부모");
//        }
        Phone(String model, String color){
            this.model = model;
            this.color = color;
            System.out.println(model + " " + color);
        }
        // 만약 부모 클래스가 매개변수를 갖는 생성자가 있다면
        // 아래 슈퍼 뭐시기에 무조건 매개변수 넣어줘야함
    }
    static class Smartphone extends Phone{
        Smartphone(String model, String color) {
            super("Samsung", "Red"); // 생략가능, 컴파일시 자동 추가
            this.model = model;
            this.color = color;
            System.out.println("Phone() 생성자 실행 자식");
        };
    }

    public static class Calculator {
        //메소드 선언
        public double areaCircle(double radius) {
            System.out.println(radius);
            return radius * radius * Math.PI;
        }
    }
    public static class Computer extends Calculator{
        @Override
        public double areaCircle(double radius) {
            System.out.println(" computer Run areaCircle ");
            return radius * radius * Math.PI /2;
        }
    }

    public static void main(String[] args) {
//        Smartphone Myphone = new Smartphone("Apple", "black");
//        System.out.println(Myphone.model);
//        System.out.println(Myphone.color);

        int radius = 10;
        Calculator calculator = new Calculator();
        System.out.println("원의 면적은 " + calculator.areaCircle(radius));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("컴퓨터의 면적은 " + computer.areaCircle(radius));
    }
// final calss 는 상속을 할 수 없다고 합니다. + final method는 오버라이딩이 불가능해진다.

    // 타입 변환도 자료형처럼 클래스도 가능하고
    // 형변환과 오버라이딩 이건 "다형성" 개념이다.
    /*
    * 즉 하나의 타입 참조 변수를 통해 여러 타입의 객체를 참조 할 수 있도록
    * 하는 것이다.
    * => 상위 클래스 타입의 참조 변수를 통해서
    * 하위 클래스의 객체를 참조할 수 있도록 허용하여
    * 상위 클래스가 동일한 메시지로 하위 클래스들이 서로 다른 동작 하도록
    *
    * 다시 말해서
    * 위에 다형성을 활용하면,
    * 부모 클래스가 자식 클래스의 동작 방식을 알 수 없어도
    * 오버라이등을 통해 자식 클래스에 젒근 할 수 있다.
    *
    * 조건
    * - 상위 클래스와 하위 클래스는 상속 관게 여야 한다.
    * - 오버라이딩(하위 클래스 메서드 재정의)이 반드시 필요하다.
    * - 자식 클래스의 객체가, 부모 클래스의 타입으로 형변환 해야함(업캐스팅)
    *
    * 이상태에서 부모 클래스의 메소드를 호출한다?
    * 메소드 오버라이딩 하지 않은 경우에는 그대로 부모 메소드가 나온다.
    * (참조 -> 객체 이름은 자식으로 호출하는데)
    * 하지만, 오버라이딩을 했다면?
    * 자식 클래스에서 오버라이딩한 메소드가 출력된다.
    * ======다형성=========
    * {자동타입 변환 + 메소드 오버라이딩 = 다형성 }
    *
    * 추상클래스
    * => 추상클래스는 새로운 실체 클래스를 만들기 위한 부모 클래스로만 사용돤된다.
    * 즉 추상 클래스는 extends 뒤에만 올 수 있다.
    * */
    public abstract class IamTired{
        String owner;
        IamTired(String owner){}
        void setOwner(String owner){}
        String getOwner(){ return owner;}

        abstract void sleep();
        // 추상메소드 특징 바디가 없음 (중괄호)
    }
    public class FairyTaile extends IamTired {

        FairyTaile(String owner) {
            super(owner); // 추상클래스 생성자에 매개변수가 없었다면 전부 공란으로 둬도 에러 안뜸 !)___(!
        }

        @Override
        void sleep() {
            // 이렇게 추상화된 메소드를 재정의 하거나 < = > 퍼블릭 클래스 앞에 추상화 붙여주면 돰
        }
    };

//    sealed private class Programmer extends Person {};
//    // 이건 안배운 내용인데, 봉인된 클래스 라는 것도 있네 ㅋㅋㅋ
//    public sealed class FairyTaile permits Programmer{};

    /*
    * 인터페이스 시작
    * 사전적인 의미로 두 장치를 연결하는 접속기를 말한다.
    * 여기서 두 장치를 서로 다른 객체로 본다면, 인터페이스는 이 두 객체를 연결하는 역할을 한다.
    *
    * 인터페이스는 다형성 구현에 주된 기술로 이용된다.
    * => 객체 A와 객체 B가 존재한다. 두 객체가 직접적으로 연결되어 있으면 하나가 바뀔떄마다 하나를 수정해야 한다.
    * 따라서 객체 들 사이에 인터페이스를 설정하고 그 사이를 연결하는 접속기로 사용한다.
    * */
    interface  WannaGoSleep {}
    public interface WannaGoSleep2 {
        String bed = null; // 맞다 인터페이스는 자동 초기화가 없어서 널값 넣어줘야 함
        default void sleep() {}
        private void drink() {}
    }
    public class Shower implements WannaGoSleep, WannaGoSleep2 {
        @Override
        public void sleep() {
            System.out.println("진짜 너무 피곤한데 샤워하고 자러갑시다");
        }// 매인 메소드에서 얘를 호출하면 implements 뒤에 있는 애들을 거쳐서 구현한 Showers 객체를 호출한다
        // 특징 하나더 위에 본거처럼 그 상속은   extends  뒤에 하나만 상속 가능한데 얘는 여러개 가능함
    }

    // 내일 할일 인터페이스 재 정립, 클래스 내부의 클래스 이너 클래스 공부, 코드 리뷰




}
