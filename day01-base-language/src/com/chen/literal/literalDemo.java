package com.chen.literal;

public class literalDemo {
    public static void main(String[] args) {
        printLiteral();
    }


    public static void printLiteral() {
        // 输出常见的字面量
        System.out.println(true);
        System.out.println(false);
        System.out.println(123);
        System.out.println(123L);
        System.out.println(123.456);
        System.out.println(123.456F);
        System.out.println('a');
        System.out.println("hello world");
        System.out.println("hello\nhello");
        System.out.println(0x10);
        System.out.println(0b1010);
        System.out.println(0b1010_1010);

    }
}
