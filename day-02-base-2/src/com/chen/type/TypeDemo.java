package com.chen.type;

public class TypeDemo {


    public static void main(String[] args) {

        int a = 10;
        print1((byte) a);


        double b = 10.99;
        System.out.println((int) b);

    }


    public static void print1(byte a) {
        System.out.println(a);
    }
}
