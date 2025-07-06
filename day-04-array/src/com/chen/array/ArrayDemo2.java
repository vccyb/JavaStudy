package com.chen.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {


        double[] scores = new double[8];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("please input" + (i + 1) + " student's score");
            double s = scanner.nextDouble();
            scores[i] = s;
        }

        System.out.println(Arrays.toString(scores));

        // 统计最高分，最低分，平均分
        double max = scores[0];
        double min = scores[0];
        double sum = 0;
        for (double score : scores) {
            if (score > max) {
                max = score;
            } else if (score < min) {
                min = score;
            }
            sum += score;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + sum / 8);
    }
}
