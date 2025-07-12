package com.chen.lambda;

public class LambadDemo1 {

    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("go go go");
            }
        };
        a.cry();


        Swim s = new Swim() {
            @Override
            public void swimming() {
                System.out.println("swimming swimming");
            }
        };

        s.swimming();

        Swim s2 = () -> {
            System.out.println("swimming swimming 2");
        };
        s2.swimming();


    }
}


abstract  class  Animal{
    public abstract void cry();
}


// 函数式接口
@FunctionalInterface
interface Swim {
    void swimming();
}