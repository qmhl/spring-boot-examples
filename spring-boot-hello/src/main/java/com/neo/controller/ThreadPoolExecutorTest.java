package com.neo.controller;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {

        System.out.println("begin" + "===========" + new Date());

        ExecutorService fixedThreadPool = Executors. newFixedThreadPool(3);
        for (int i =1; i<=5;i++){
            final int index=i ;
            fixedThreadPool.execute(new Runnable(){
                @Override
                public void run() {
                    try {
                        System.out.println("第" +index + "个线程" +Thread.currentThread().getName());
                        Thread.sleep(1000);
                    } catch(InterruptedException e ) {
                        e .printStackTrace();
                    }
                }

            });
        }
        System.out.println("end  " + "===========" + new Date());

//        begin===========Mon Apr 08 21:40:07 CST 2019
//        end  ===========Mon Apr 08 21:40:07 CST 2019
//        第1个线程pool-1-thread-1
//        第2个线程pool-1-thread-2
//        第3个线程pool-1-thread-3
//        第4个线程pool-1-thread-2
//        第5个线程pool-1-thread-3
    }
}
