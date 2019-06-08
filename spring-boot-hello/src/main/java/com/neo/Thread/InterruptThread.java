package com.neo.Thread;

public class InterruptThread extends Thread{
    public static void main(String[] args) {
        InterruptThread t=new InterruptThread();
        t.start();
        try {
            Thread.sleep(2000);//使开启的线程能够跑到执行体，否则线程还没到达执行体就被中断，此时判断中断状态肯定为true。
            //那么就不能跑到执行体里面了
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("主线程中断开启线程");
        t.interrupt();//主线程中断开启线程
        System.out.println("等待中断请求");
        try {
            Thread.sleep(3000);//等待开启线程处理中断
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("应用程序结束");

    }


    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            System.out.println("线程正在运行。。");
            for(int i=0;i<10;i++) {
                System.out.println("i的值为："+i);
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("开启线程被中断");
                Thread.currentThread().interrupt();//对中断请求的处理就是中断自己
            }
        }
    }
}
