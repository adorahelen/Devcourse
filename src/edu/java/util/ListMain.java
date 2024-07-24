package edu.java.util;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    // 배열을 확장했다우

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        List<Object> Lists = new ArrayList<Object>();
        ArrayList a = new ArrayList();
        System.out.println(a);


        list.add(1);
        list.add(2);
        list.add(true);
        list.add(3);
        list.add("넷이다");
        list.add(4.0);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(Lists.size());

        ArrayList<Object> arrlist = new ArrayList<>();
        System.out.println(arrlist);

        if (list.contains(2)) {
            list.remove(2);
            list.remove(list.indexOf(2));
        }
        list.remove("넷이다");
        System.out.println(list);




    }
}
