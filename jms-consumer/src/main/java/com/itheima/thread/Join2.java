package com.itheima.thread;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Join2 {
    public static void main(String[] args) {
        final Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 begin");
            }
        },"t1");
        final Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 begin");
            }
        },"t2");
        final Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t3 begin");
            }
        },"t3");
        /*thread1.start();
        thread2.start();
        thread3.start();*/
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.shutdown();
        HashMap<String,String>map=new HashMap<String, String>();
    }
}
