package com.chen.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemp {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        map.put("1", "hello");
        map.put("2", "world");
        map.put("3", "java");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });

        map.forEach(
            ( key,  value) ->
                System.out.println(key + ":" + value)

        );

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
