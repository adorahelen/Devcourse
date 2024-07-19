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

        System.out.println("---");
        Sam.sumAll();
        // static 으로 선언된 메서드는 객체를 이용하지 않고 사용이 가능하다
        OverLoading.sumAll();// 객체를 이용하지 않고 클래스 이름으로 접근하여 사용가능
        System.out.println("1 + 2 = " + OverLoading.sumAll(1 , 2));
        System.out.println("x + y + z = " + OverLoading.sumAll(1 , 2 , 3));
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        double[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(OverLoading.sumAll(nums));
        System.out.println(OverLoading.sumAll(1.0, 2.0, 3.0));
        System.out.println(OverLoading.sumAll(nums2));

        System.out.println(won.PI);
        System.out.println(OverLoading.PI);

    }
}
