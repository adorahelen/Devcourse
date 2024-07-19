package edu.java.oop;

public class OverLoadMain {
    public static void main(String[] args) {

        OverLoading Saa = new OverLoading("정사각형");
        OverLoading won = new OverLoading("원");
        OverLoading Sam = new OverLoading("삼각형");

        Saa.area();
        Saa.area(10);
//        double a= Saa.area(2.5);
//        System.out.println(a);

        won.area(5.0);
        System.out.println(won);
        System.out.println(Saa);
        System.out.println(won.area(5.0));
        System.out.println(Sam.area(5, 5));
        System.out.println(Sam);
        System.out.println(Sam.toString());
        System.out.println(Sam);
    }
}
