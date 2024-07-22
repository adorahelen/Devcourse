package edu.java.oop.abst;

public class animalMain {
    public static void main(String[] args) {
        // 추상 클래스는 객체 ㅐㅇ성이 불가능하다
        //animall h = new animall();

        human h = new human("man", "city", "180");
        Dolphin d = new Dolphin("sas", "ass", "asdad");

        h.move();
        h.eat();
        h.HumansPower();

        d.move();
        d.eat();
        d.Dolpins_SnickBoom();
    }

}
