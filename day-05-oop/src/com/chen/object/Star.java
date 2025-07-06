package com.chen.object;

public class Star {
    String name;
    int age;
    String gender;
    double height;
    double weight;


    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
