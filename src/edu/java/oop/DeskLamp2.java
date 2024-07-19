package edu.java.oop;

public class DeskLamp2 {

    public DeskLamp2(int VOLT) {
         this.VOLT = VOLT;
    }
    public DeskLamp2(int volt, int volt2) {
        this.VOLT = volt2;
    }

     final int VOLT;
     private boolean power;
     private int bright;

}
