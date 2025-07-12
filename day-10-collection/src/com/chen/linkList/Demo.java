package com.chen.linkList;

import java.util.LinkedList;

public class Demo {


    public static void main(String[] args) {

        LinkedList<String> queue  = new LinkedList<>();
        queue.addLast("hello");
        queue.addLast("world");
        queue.addLast("java");

        queue.removeFirst();

        System.out.println( queue);
    }
}
