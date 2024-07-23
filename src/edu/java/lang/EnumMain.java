package edu.java.lang;

enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER,
    All;
}
public class EnumMain {
    public static void main(String[] args) {
        Season Summer =  Season.SUMMER ;
        String season = String.valueOf((Season.SUMMER));
        season = Season.SPRING + "";
        season = Season.FALL.toString()

                Season[] values = Season.values();
        System.out.println(Summer);


    }
}
