package com.neo.controller;


import java.util.Date;

public class SleepTest {
    public static void main(String[] args) throws Exception {
        System.out.println("begin" + "===========" + new Date());
        System.out.println("开始执行业务");

        Thread.sleep(5000);//模拟业务场景
        System.out.println("执行业务结束");

        System.out.println("end" + "===========" + new Date());
    }
}