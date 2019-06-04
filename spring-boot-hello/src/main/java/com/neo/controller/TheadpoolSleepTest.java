package com.neo.controller;

import java.util.Date;
import java.util.concurrent.Executors;

public class TheadpoolSleepTest {
    public static void main(String[] args) throws Exception {

        System.out.println("begin" + "===========" + new Date());

        //  目前我们不需要中间处理的结果，因此可以让它在后台执行，不阻塞主线程
        Executors.newSingleThreadExecutor().submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);// 模拟业务场景
                    System.out.println("模拟业务场景" + "===========" + new Date());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("end"+ "===========" + new Date());
    }
}
