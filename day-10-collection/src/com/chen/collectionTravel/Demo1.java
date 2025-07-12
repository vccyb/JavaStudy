package com.chen.collectionTravel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {


    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("zhanSan");
        names.add("lisi");
        names.add("wangWu");
        names.add("zhaoliu");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }


        for(String name: names) {
            System.out.println(name);
        }

        String[] strArr = {
                "hello", "world", "java"
        };
        for(String str: strArr) {
            System.out.println(str);
        }

    }
}
