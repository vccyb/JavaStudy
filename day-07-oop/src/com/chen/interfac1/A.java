package com.chen.interfac1;

public interface A {
    String SCHOOL_NAME = "chen";


    default void show()
    {
        System.out.println("show");
    }

    static void show2()
    {
        System.out.println("show2");
    }

    void show3();
}
