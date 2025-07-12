package com.chen.Method1Re;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18);
        students[1] = new Student("李四", 20);
        students[2] = new Student("王五", 19);


//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

//        Arrays.sort(students, (o1, o2) -> Student.compareTo(o1, o2));
        Arrays.sort(students, Student::compareTo);
        System.out.println(Arrays.toString(students));
    }
}



