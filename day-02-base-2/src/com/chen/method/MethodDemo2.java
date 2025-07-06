package com.chen.method;

public class MethodDemo2 {


    public static void main(String[] args) {


        printHello("张三");
        printHello(18);
    }


    // 定义一个重载的方法
    public static void printHello(String name) {
        System.out.println("hello " + name);
    }

    public static void printHello(int age) {
        System.out.println("hello " + age);
    }
}
