package com.chen.innerClass;

public class Test {

    public static void main(String[] args) {


        Outer.Inner inner = new Outer().new Inner();
        inner.show();

    }
}
