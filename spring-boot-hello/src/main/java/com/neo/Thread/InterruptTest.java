package com.neo.Thread;

import java.util.Date;

public class InterruptTest {
    public static volatile boolean exit = false;//退出标志

    public static void main(String[] args) {
        new Thread() {
            public void run() {
                System.out.println("线程启动了");
                while (!exit) {
                    try {
                        System.out.println("线程开始执行业务"+new Date());
                        Thread.sleep(1000);
                        System.out.println("线程结束执行业务"+new Date());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程结束了");
            };
        }.start();

        try {
            System.out.println("主线程开始"+new Date());
            Thread.sleep(1000 * 5);
            System.out.println("主线程结束"+new Date());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exit = true;//5秒后更改退出标志的值
    }
}
