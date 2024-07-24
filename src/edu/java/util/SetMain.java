package edu.java.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(); // 집합~~~
        set.add("1");
        set.add("sam");
        set.add("e");
        set.add("N");
        set.add("2");
        set.add("A");
        set.add("1");
        System.out.println(set); //정렬 노

        Set<String> tSet = new TreeSet<>(); // 집합 오브 트리로
        tSet.add("1");
        tSet.add("sam");
        tSet.add("e");
        tSet.add("N");
        tSet.add("2");
        tSet.add("A");
        tSet.add("1");
        System.out.println(tSet); // 자동 정렬

        System.out.println(tSet.size());
        if (tSet.contains("A")) {
            tSet.remove("A");

        }
        System.out.println(tSet.size());
        System.out.println(tSet);

    }
}
