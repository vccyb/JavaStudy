package com.chen;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        health();
    }


    // 开发一个健康应用程序，可以基于输入，计算BMI合BMR
    public static void health() {
        System.out.println("请输入你的体重：");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.println("请输入你的身高：");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI：" + bmi);
        System.out.println("BMR：" + (66 + (13.7 * weight) + (5 * height) - (6.8 * 18)));

    }
}
