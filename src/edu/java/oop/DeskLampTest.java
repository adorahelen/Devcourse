package edu.java.oop;

import java.util.Scanner;

public class DeskLampTest {
    public static void main(String[] args) {

        DeskLamp MyDesk = new DeskLamp();

        System.out.println(MyDesk);

        MyDesk.setBrightness(2);
        if (MyDesk.getBrightness() == 0) {
            MyDesk.powerOff(); }
        else MyDesk.powerOn();

        System.out.println(MyDesk.toString());

//        DeskLamp myLamp = new DeskLamp();
//        System.out.println(myLamp);
//
//        myLamp.powerOn();
//        System.out.println(myLamp);
//
//        myLamp.setBrightness(3);
//        System.out.println(myLamp.totoString());
    }
}
