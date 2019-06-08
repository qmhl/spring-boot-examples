package com.neo.Thread;

import java.util.Date;

public class Interrupt {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("线程启动了"+new Date());
                try {
                    Thread.sleep(1000 * 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程结束了"+new Date());
            }
        };
        thread.start();

        try {
            System.out.println("主线程开始"+new Date());

            Thread.sleep(1000 * 5);//  阻塞5s钟  5s后 开始执行后面的方法

            System.out.println("主线程结束"+new Date());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();//作用是：在线程阻塞时抛出一个中断信号，这样线程就得以退出阻塞的状态
    }
}
