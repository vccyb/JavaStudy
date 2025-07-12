package com.chen.streamDemo;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        List<String> list1 = s1.filter(s -> s.length() > 3)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());


        // 数组的stream demo
        String[] arr = {"hello", "world", "java"};
        Stream<String> s2 = Arrays.stream(arr);
        List<String> list2 = s2.filter(s -> s.length() > 3)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
                System.out.println(list2);

    }
}
