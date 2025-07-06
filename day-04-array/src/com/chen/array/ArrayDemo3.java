package com.chen.array;

import java.util.Arrays;

public class ArrayDemo3 {

    public static void main(String[] args) {


        // 二维数组demo
        int[][] arr = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(arr[1][2]);
        System.out.println(Arrays.toString(arr[1]));

    }
}