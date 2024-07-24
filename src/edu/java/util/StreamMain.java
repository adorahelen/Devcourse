package edu.java.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        int[] arr0to4 = {0,1,2,3,4};
        System.out.println(Arrays.toString(arr0to4));
        System.out.println("-----------------------");

        IntStream is = IntStream.range(0,5);

        is = IntStream.rangeClosed(0, 5);
        is = Arrays.stream(arr0to4);
        is.forEach(i -> System.out.print(i + " "));
        is = IntStream.of(arr0to4);
        is = IntStream.of(0, 1,2,3,4);
        System.out.println();
        is.forEach(i -> System.out.print(i + " "));

        System.out.println();
        is = new Random().ints(5);
        is = new Random().ints(5, 0, 5);
        is.forEach(System.out::println);
        System.out.println();

        System.out.println("-------------");
        DoubleStream ds = new Random().doubles(5);
        ds.forEach(System.out::println);
        System.out.println();


        System.out.println("==========");
        String[] arr = {"asda", "ssdd", "sdasd"};
        List<String> list = Arrays.asList("aads", "sadas", "sad");
        System.out.println(list);
        System.out.println(arr);

        Stream<String> s1 = Arrays.stream(arr);
        s1 = list.stream().filter(l -> l.contains("a"));
        System.out.println(list);
        System.out.println(s1.collect(Collectors.toList()));

        list.stream()
                .map(l -> l.toUpperCase())
                .forEach(l -> System.out.print(l + " "));


        System.out.println();

        list.stream()
                .map(String::toLowerCase)
                .forEach(l -> System.out.print(l + " "));

        System.out.println();

        list.stream()
                .sorted()
                .forEach(l -> System.out.print(l + " "));

        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(l -> System.out.print(l + " "));
    }

}
