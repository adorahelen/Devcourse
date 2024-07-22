package edu.java.oop.exercise;

public class PersonMain {
    // 펄슨 객체를 매개변수로 받아서 이름과 전화번호를 화면에 표시하는
    // 공유 메서드 PersonInfo () 작성

    public void Personinfo(Person person) {
        System.out.println("----연락처 정보---");
        System.out.println("이름 : " + person.getName());
        System.out.println("전화번호 : " + person.getTel());
        System.out.println();
//        System.out.println(person);
//        System.out.println(person2);
    }
    // 반환값 : x
    // 출력형태 : =====연락처정보======
    //            이름 :
    //            전화번호 :

    public static void main(String[] args) {
//        Person person1 = new Person("나루토", "010-1234-5678");
//        Person person2 = new Person("사스케", "010-1234-5678");
//
        Person person1 = new Person();

//        Person person2 = new Person(args[1], args[2]);

        PersonMain pm = new PersonMain();
        pm.Personinfo(person1);

        Person person2 = new Person();
        person2.setName("Han");
        person2.setTel("1888888888");
        pm.Personinfo(person2);


        // 명령해 매개변수 이용해서
        // 프로그램 실행시 이름과 전화번호를 전달받고
        // 전달 받은 값으로 펄슨 객체를 생성한 후
        // 정보룰 화면에 출력하는 메서드를 호출


        // Person 객체 Person 2 생성
        //


    }
}


