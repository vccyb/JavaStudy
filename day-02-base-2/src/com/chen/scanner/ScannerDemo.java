package com.chen.scanner;

import java.util.Scanner;

public class ScannerDemo {


    public static void main(String[] args) {

        print1();
    }


    public static void print1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String next = scanner.next();
        System.out.println(next);
    }
}
