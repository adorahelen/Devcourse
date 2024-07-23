package edu.java.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMain {
    public static void main(String[] args) {

       Integer lottowin[] = { };
// 래퍼 클래스 => 기본 형을 참조 자료형으로 만들어 줌 , 박싱 언박싱
        System.out.println();
        System.out.println(Arrays.toString(lottowin));

        Arrays.sort(lottowin);
        System.out.println(Arrays.toString(lottowin));
        System.out.println(
        );

        System.out.println("Dessending sort");
        Arrays.sort(lottowin, Collections.reverseOrder());


    }
}
