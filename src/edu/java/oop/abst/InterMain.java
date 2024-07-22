package edu.java.oop.abst;
// 인터페이스는 다중 상속이 가능하다
interface InterFaceA {
    int power = 1;
    // 인터페이스는 상수만 존재하기에 무조건 값을 넣어서 저장해야 한다.
    //int k;
}
interface InterFaceB {
    public static final int k = 1;

    public void methongd();
    // 바디를 ㄱ ㅏ질 수 없기에 이렇게 작성 즉 추상 메소드만 존재 앱스트랙트 키워드가 없어도

}
interface InterFaceC extends InterFaceB, InterFaceA{
    public default void methong(){ // 디폴트 메소드
        System.out.println("asdsadasadasdsadsa333");// 디폴트 쓰면 바디. 몸체를 가질 수 있음
    };
    public static void meea(){ // 공유 메소드
        System.out.println("asdasdaasdadfgg222222");
    }
}

class InterImple implements InterFaceA{}
class InterImple2 implements InterFaceB{
    public void methongd(){}
}
class InterImple3 implements InterFaceC{
    @Override
    public void methong(){
        System.out.println("asdsadasadsadsadsa44");
    }
    @Override
    public void methongd() {
        System.out.println("asdsadasadsadsadsa555");
    }
}// 덮어쓴거다 오버라이딩으로

public class InterMain {
    public static void main(String[] args) {
        InterImple3 c = new InterImple3();

        c.methong();
        c.methongd();

        System.out.println(c);

    }
}
