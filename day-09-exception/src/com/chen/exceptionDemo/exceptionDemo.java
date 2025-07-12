package com.chen.exceptionDemo;

public class exceptionDemo {


    public static void main(String[] args) {

        test1();

    }


    public static void test1() {

        String str = null;
        System.out.println(str);
        System.out.println(str.length());
        System.out.println("== 程序结束");
    }
}
