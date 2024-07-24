package edu.java.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(31, "four");
        map.put(5, "five");
        System.out.println(map);
        System.out.println(map.get(31));
        System.out.println();

        Set<Integer> KeySetS = map.keySet();
        //int a = map.keySet();
        for (int key :KeySetS ) {
            System.out.println(key);
        }
        for (Integer key : KeySetS) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println();
        System.out.println("Iterator 이용해서 map값 출력 - while");

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            System.out.println(key + ":" + map.get(key)) ;
        }

        System.out.println();
        System.out.println("3. Bicosunmer interface use for printf map on ramda");
        map.forEach((k, v) -> System.out.println(k + ":" + v));





    }
}
