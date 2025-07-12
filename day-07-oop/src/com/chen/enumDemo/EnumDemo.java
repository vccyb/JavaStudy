package com.chen.enumDemo;

public class EnumDemo {
    public static void main(String[] args) {
        A a1 = A.X;

        System.out.println(a1.toString());

        fn(a1);
    }


    public static void fn(A a) {
        switch (a) {
            case A.X:
                System.out.println("X");
                break;
            case Y:
                System.out.println("Y");
                break;
            case Z:
                System.out.println("Z");
                break;
            default:
                break;
        }
    }
}
