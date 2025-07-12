package com.chen.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {


    public static void main(String[] args) {
        List<Integer> redPacket = getRedPacket();
        System.out.println(redPacket);

        // 创建100个线程
        for(int i = 1; i <= 100; i ++) {
            new PeopleGetRedPacket(redPacket, "people:" + i).start();
        }

    }


    public static List<Integer> getRedPacket() {
        Random r = new Random();
        List<Integer> redPacket = new ArrayList<>();
        for(int i = 1; i <= 160; i ++) {
            redPacket.add(r.nextInt(30) + 1);
        }

        for(int i = 1; i <= 40; i ++) {
            redPacket.add(r.nextInt(70) + 31);
        }
        return redPacket;
    }
}


