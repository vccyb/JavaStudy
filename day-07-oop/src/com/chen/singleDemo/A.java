package com.chen.singleDemo;

public class A {


    private static final A instance = new A();

    private A() {

    }


    public static A getInstance() {
        return instance;
    }
}
