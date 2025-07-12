package com.chen.innerClass2;

public class Test {

    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("cry");
            }
        };
        a.cry();
    }
}
