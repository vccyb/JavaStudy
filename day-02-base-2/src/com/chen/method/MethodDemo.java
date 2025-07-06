package com.chen.method;

public class MethodDemo {


    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        print3Hello();
    }


    // 定义一个方法，求任意两个整数的合
    public static int getSum(int a, int b) {
        return a + b;
    }


    public static void print3Hello() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
