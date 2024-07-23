package edu.java.lang;

public class MathMain {
    public static void main(String[] args) {
        System.out.println(Math.ceil(3.4));
        System.out.println(Math.ceil(3.5));
        System.out.println();

        System.out.println(Math.floor(3.4));
        System.out.println(Math.floor(3.5));
        System.out.println();

        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
        System.out.println();

        double random = Math.random();
        System.out.println(random);

        int zeroOneTwo = (int)(random * 3);
        System.out.println(zeroOneTwo);

        int oneOneTwo = (int)(random * 3 + 1);
        System.out.println(oneOneTwo);

    }
}
