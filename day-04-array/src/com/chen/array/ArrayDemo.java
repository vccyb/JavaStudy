package com.chen.array;

public class ArrayDemo {


    public static void main(String[] args) {

        randomCall();

    }


    public static void randomCall() {
        String[] name = {"张三", "李四", "王五", "赵六", "孙七"};
        int index = (int) (Math.random() * name.length);
        System.out.println(name[index]);

        System.out.println(name);
    }
}
