package edu.java.oop.abst;

public class human extends animall {
    String human_name;


    public human(String man, String city, String number) {
        super();
        this.human_name = man;

    }

    @Override
    public void move() {
        System.out.println("나는 걷는ㄷㅏ ");

    }

    @Override
    public void eat() {

    }

    public void HumansPower(){
        System.out.println("HumansPower=>>>>>>>>." +
                "<+++++++++++++");
    }
}
