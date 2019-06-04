package com.neo.controller;

import java.util.Date;
import java.util.concurrent.Executors;

public class ThreadMoreSleepTest {
    static double x=0;
    public static void main(String[] args){

        System.out.println("begin" + "===========" + new Date());

        Thread T1=new Thread(new Thre1());//创建线程
        Thread T2=new Thread(new Thre2());//创建线程
        new Thread(T1).start();//开启线程

        new Thread(T2).start();//开启线程
        System.out.println("end  " + "===========" + new Date());

    }

    public static class Thre1 extends Thread {

        public void run(){//run方法，里面包含需要执行的任务
            while(true){
                try {
                    Thread.sleep(2000);	//使得线程休息时间300ms
                    x+=1.0;
                    System.out.println("执行业务1"+x+ "===========" + new Date());
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
    }
    public static class Thre2 extends Thread{
        public void run(){//run方法，里面包含需要执行的任务
            while(true){
                try {
                    Thread.sleep(7000);	//使得线程休息时间400ms
                    x+=0.1;
                    System.out.println("执行业务2= "+x+ "===========" + new Date());
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}
