package edu.java.basic;

public class Java_0717_OpIfWhile {
    public static void main(String[] args) {

//      int varr = 'x';
//      boolean result = varr >= 'A';
//        System.out.println(result);
//
//        char ch = 'K';
//        boolean lower = ch >= 'A' && ch <= 'Z';
//        boolean upper = ch >= 'a' && ch <= 'z';
//        boolean alpha = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
//
//        System.out.println(lower);
//        System.out.println(upper);
//        System.out.println(alpha);
//        System.out.println(!alpha);
//
//        int x = 6;
//        boolean result = x % 2 == 0 ? true : false;
//        System.out.println(result);
//
//        var year = 2024;
//
//        var results = (year % 4 == 0 && year % 100 != 0)
//                ||
//                (year % 400 == 0)
//                ? true : false;
//
//        System.out.println(results);


        // if 조건문 시작
        // 조건식 (    ) 안에는 연산의 최종 결과가 boolean 인 경우만 가능
        // a 가 참인 경우, b 보다 작을 경우 등등
        String state = null;
        int jisu = 30;
        if (jisu <= 50) {
            state = "good";

        }
        System.out.println(state);

    }
}

