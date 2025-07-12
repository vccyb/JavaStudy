package com.chen.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo2 {


    public static void main(String[] args) {


        MyCallable c1 = new MyCallable(100);
        FutureTask<String> f1 = new FutureTask<>(c1);
        new Thread(f1).start();

        System.out.println(Thread.currentThread().getName());


        try {
            String s = f1.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}


class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName());
        }
        return "子线程" + sum;

    }
}

