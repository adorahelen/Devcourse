package edu.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

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

        System.out.println("List 1번 데이터 변경하기" + list.get(1));
        list.set(1, "3.0");
        System.out.println(list);

        System.out.println("for / for each 로 리스트 값 출력");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();
        for(Object b : list){
            System.out.print(b + "  ");
        }
        System.out.println();

        System.out.println("Iterator 를 이용해서 list 의 값을 출력하기 ");

        Iterator<Object> itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + "  ");
        }
        System.out.println();
        System.out.println("Consumer 인터페이스를 이용하여 리스트를 출력 ");
        Consumer<Object> consumer = new Consumer<Object>() { // 익명의 클래스로 인터페이스 구현
            @Override
            public void accept(Object t) {
                System.out.print(t + " ");
            }
        };
        list.forEach(consumer);

        System.out.println();
        System.out.println(" 람다 컨슈머 인터페이스");
        list.forEach(o -> System.out.println(o + " "));
        System.out.println();
        ////////////////////////


        System.out.println("배열을 리스트로 전환하기");
        String[] animals = {"강아지", "코끼리", "사자"};
        List<String> animalsList = Arrays.asList(animals);

        System.out.println(Arrays.toString(animals));
        System.out.println(animalsList);
        System.out.println();

        animalsList.set(1, "bee");
        System.out.println(animalsList);

        System.out.println("리스트를 ==> 배열로 ");
        animals = animalsList.toArray(new String[0]);
        animals = animalsList.toArray(String[]::new);

        System.out.println(Arrays.toString(animals));
        System.out.println(animalsList);
        System.out.println();

        //animalsList.add("cow"); 배열을 리스트로 담은 경우 예외 발생
        // Vector 를 개선한 컬렉션이 =>  ArrayList 컬렉션이다



    }
}
