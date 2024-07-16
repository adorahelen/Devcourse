package edu.java.basic;

public class Java_0716_Exe {
    //  변수 ch 를 선언하며 임의의 알파벳 문자 하나로 초기화
    // 문자 ~ 의 아스키 코드는 :~~
    public static void main(String[] args) {


        char kangmin = 'A';
        int kangmin2 = kangmin;
        System.out.println("문자 A의 아스키코드 : " + kangmin2);

        var code = 33;
        System.out.println("아스키코드 " +code+ "의 문자는 " + (char)code);

    }

}
