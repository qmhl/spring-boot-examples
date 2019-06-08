package com.neo.Thread;

import java.util.Date;

public class Interrupt2 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("线程启动了"+new Date());

                while (!isInterrupted()) {
                    System.out.println(isInterrupted());//调用 interrupt 之后为true
                }
                System.out.println("线程结束了"+new Date());

            }
        };
        thread.start();

        try {
            System.out.println("主线程开始"+new Date());

            Thread.sleep(3000);
            System.out.println("主线程结束"+new Date());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("线程是否被中断：" + thread.isInterrupted());//true
    }
}
