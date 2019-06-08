package com.neo.controller;

import java.util.Date;

public class ThreadFlag extends Thread {
    // 退出的标志位
    public volatile boolean exit = false;

    public void run() {
        while (!exit) ;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("线程开始!"+ new Date());

        ThreadFlag thread = new ThreadFlag();
        thread.start();
        sleep(5000); // 主线程延迟5秒  如果sleep()在run（）中的话 执行结果就不一样了

        thread.exit = true;  // 终止线程thread
        thread.join();
        System.out.println("线程退出!"+ new Date());
    }
}
