package com.neo.controller;

import java.util.Date;

public class ThreadSleepTest {

    public static void main(String[] args) throws Exception {
        System.out.println("begin" + "===========" + new Date());

        //不阻塞主线程  可以在后台执行
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);//模拟业务场景
                    System.out.println("模拟业务场景" + "===========" + new Date());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("end  " + "===========" + new Date());
    }
}