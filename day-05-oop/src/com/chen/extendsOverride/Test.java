package com.chen.extendsOverride;

public class Test extends Object {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();

    }
}


class Cat extends Animal {

    @Override
    public void cry() {
        System.out.println("cat cry");
    }
}

class Animal {
    public void cry() {
        System.out.println("Animal cry");
    }
}