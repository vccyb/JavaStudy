package com.chen.demo;

public class demo {

    public static void main(String[] args) {

        Runnable r = new MyRunnable();
        new Thread(r).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程启动了2");
            }
        }).start();


        new Thread(() -> System.out.println("线程启动了3")).start();
    }
}



class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("线程启动了");
    }
}
