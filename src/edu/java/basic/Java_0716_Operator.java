package edu.java.basic;

public class Java_0716_Operator {
    public static void main(String[] args) {

        // 증감 연산자
        // 산술 연산자
        // 시프트 연산자
        // 비교 연산자
        // 비트 연산자
        // 논리 연산자
        // 조건 연산자 (삼항)
        // 대입 연산자

//        System.out.println("buho ------------");
//        int buho = 3;
//        System.out.println(buho);
//
//
//        System.out.println("buho operator ------------");
//        int divide = 7 + 6 - 5 * 4 /3;
//        int modulo = 7 + 6 -5 * 4 % 3;
//        System.out.println(divide);
//        System.out.println(modulo);

        int sec = 3695;
        int min = sec / 60;
        int time = min / 60;
        int realsec = sec % 60;
        System.out.println(sec + "초는 "  + time + " 시간 " + min + "분 " + realsec);


    }
}
