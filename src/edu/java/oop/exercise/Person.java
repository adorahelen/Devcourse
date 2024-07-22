package edu.java.oop.exercise;

// 필드들은 객체 내부에서만 접근 가능 => 프라이빗 써라
// 필드들의 값을 매개변수로 받아서 초기화하는 생성자 = > 게터
// 객체 외부에서 필드에 접근 가능하도록 메서드들을 정의 = > 세터
// 객체의 필드값들을 문자열로 반환하는 메서드 정ㅇ => 투스트링

public class Person {
    public Person() {}

    private String name;
    private String tell;

    Person(String name, String number) {
        this.name = name;
        this.tell = tell;
    }

    Person(String name){}
    // 겟터 셋터 써야 했음

// command + N
    public String getName() {
        return name;
    }
    public String getTel() {
        return tell;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTel(String tel) {
        this.tell = tel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tel='" + tell + '\'' +
                '}';
    }
}
