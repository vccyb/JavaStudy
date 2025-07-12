package com.chen.singleDemo;

public class Test {

    public static void main(String[] args) {

        A a = A.getInstance();
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }
}
