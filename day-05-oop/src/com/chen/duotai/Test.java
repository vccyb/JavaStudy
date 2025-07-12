package com.chen.duotai;

public class Test {

    public static void main(String[] args) {
         Animal a1 = new Cat();
         Animal a2 = new Dog();
         a1.eat();
         a2.eat();

         if(a1 instanceof Cat) {
             Cat c1 = (Cat) a1;
             System.out.println(c1.name);

         }


        System.out.println(a1.name);
        System.out.println(a2.name);

    }
}
