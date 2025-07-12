package com.chen.demo2;

import java.util.List;

public class PeopleGetRedPacket extends Thread {

    private final List<Integer> redPacket;

    public PeopleGetRedPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }


    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        while (true) {
            synchronized (redPacket) {

                if (redPacket.isEmpty()) {
                    break;
                }

                int index = (int) (Math.random() * redPacket.size());
                Integer removed = redPacket.remove(index);
                System.out.println(name + "抢到红包，金额是：" + removed);


                if (redPacket.isEmpty()) {
                    System.out.println("end ");
                }
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
