package com.chen.staticDemo;

public class A {
    static {
        System.out.println("A类静态代码块");
    }

    {
        System.out.println("A类普通代码块");
    }

    public void show() {
        System.out.println("A类普通方法");
    }
}
