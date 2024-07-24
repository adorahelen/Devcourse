package edu.java.util;


import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionPKGmain {
    public static void main(String[] args) {
        System.out.println("1. Consumer 인터페이스를 람다식으로 구현");
        Consumer<Integer> consumer = (arg) -> System.out.println(arg*2);
        consumer.accept(3);
        // acept(Integer arg)  { sout ( args * 2 ) }

        System.out.println();
        System.out.println("2. Bifunction - return 0 ");
        BiFunction<Integer,Integer, Double>  bif = (x,y) -> Math.pow(x,y);
        System.out.println(bif.apply(10,2));

        System.out.println();
        System.out.println("3. Supplier - return 0 , arg x");
        Supplier<Boolean>sup = () -> new Random().nextBoolean();
        System.out.println(sup.get());
        System.out.println();

        System.out.println("4. list의 값을 람다식으로 출력 ");
        List<String> list =  Arrays.asList("ace, bus, sky, amt");
        System.out.println(list);
        list.forEach(System.out::println);
        list.forEach(l -> System.out.println("-" + l));
        System.out.println();

        System.out.println("5. map의 값을 람다식으로 출력 ");
        Map<String, String>map = new HashMap<>();
        map.put("ace", "bus");
        map.put("sky", "amt");
        map.forEach((k,v) -> System.out.println(k + "=" + v));


    }
}
