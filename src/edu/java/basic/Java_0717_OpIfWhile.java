package edu.java.basic;

import java.util.Scanner;

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
//        String state = null;
//        int jisu = 30;
//        if (jisu <= 50) {
//            state = "good";
//
//        }
//        System.out.println(state);

//        //구구단
//        int i = 1;
//        int j = 0;
//        for (; i <= 9; i++) {
//            System.out.println(i + "+" + i + "=" + i * i );
//            for (; j <= 9; j++) {
//                System.out.println(i + "-" + j + "=" + i * j );
//            }
//        }

//            int i = 10;
//            while (1 <= i) {
//                System.out.println(i);
//
//                if (i == 1) {
//                    System.out.println("Fire");
//                }
//                i -= 1;
//            }

//        int i = 0;
//        for (; i < 100; i+=7){
//            if (i == 0)
//                continue;
//            System.out.print(i + " ");
//        }

//        int j = 0;
//        for (; j < 100; j+=7){
//            if (j==0)
//                continue;
//            else if (j % 3 == 0) {
//                continue;
//            }
//            System.out.print(j + " ");
//        }

//        for (int i = 1; i < 100; i++) {
//            if ( i % 7 == 0 && i % 3 != 0) {
//                System.out.print(i + " ");
//            }
//        }

//        for (int i = 100; 1 < 100; i--) {
//            if ( i % 7 == 0 && i % 3 != 0) {
//                System.out.print(i + " ");
//
//            }
//            if ( i == 0)
//                break; }

        rkadls:   // for 문을 지정해서
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                if (i == 3)
                    break rkadls; // for 문을 중단 시킬 수 있다
                System.out.print("ㅁ ");
            }
            System.out.print("\n");
        }




    }
}

