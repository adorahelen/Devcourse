package edu.java.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bee", "air", "Sea", "Ace", "sky");
        System.out.println(list);
//
//        Collections.sort(list); // 리스트  오름 차순으로 정렬, = 대소문자 구분 0
//        System.out.println(list);
//
//        // 익명의 객체로 Comparator 인터페이스를 구현하여
//        // 대소문자를 무시하고 정렬하도록 정렬 기준 재정의
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        };
//        Collections.sort(list, comparator);
//        System.out.println(list);
//        System.out.println();


        Collections.sort(list, (o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(list);
    }
}
