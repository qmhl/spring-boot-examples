package com.neo.controller;

public class ThreadMoniChangJing {
    public static void main(String[] args) throws InterruptedException {

        //PS: 使用 Thread.sleep(long millis);演示等待时间效果

/*        Thread.sleep(1000 * 3);
        System.out.println("1 存用户信息到\"用户\"表 成功");

        Thread.sleep(1000 * 2);
        System.out.println("2 存用户上传附件到\"附件\"表 成功");

        Thread.sleep(1000 * 1);
        System.out.println("3 发送邮件通知用户激活 成功");

        Thread.sleep(1000);
        System.out.println("4 注册成功提示");

        System.out.println("用户已经等的不耐烦了......");*/

//        1 存用户信息到"用户"表 成功
//        2 存用户上传附件到"附件"表 成功
//        3 发送邮件通知用户激活 成功
//        4 注册成功提示
//        用户已经等的不耐烦了......


//        ================================================


        // 1
        Thread userInfoThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("保存用户信息到用户表开始...");
                try {
                    Thread.sleep(1000 * 3);
                    System.out.println("1 存用户信息到\"用户\"表 成功");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("保存用户信息到用户表结束...");
            }
        });

        userInfoThread.start();
        System.out.println(userInfoThread.getName());
        System.out.println("---------用户基本信息线程关闭");
        Thread.interrupted();

        // 2
        Thread attachmentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("保存附件信息到附件表开始...");
                try {
                    Thread.sleep(1000 * 2);
                    System.out.println("2 存用户上传附件到\"附件\"表 成功");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("保存附件信息到附件表结束...");
            }
        });

        attachmentThread.start();
        System.out.println(attachmentThread.getName());
        System.out.println("-----------附件信息线程关闭");
        Thread.interrupted();

        Thread mailThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("处理发送邮件开始...");
                try {
                    Thread.sleep(1000 * 1);
                    System.out.println("3 发送邮件通知用户激活 成功");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("处理发送邮件结束...");
            }
        });

        mailThread.start();
        System.out.println(mailThread.getName());
        System.out.println("---------邮件线程关闭");
        Thread.interrupted();

        Thread callBackThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("4 注册成功提示");
            }
        });

        callBackThread.start();
        System.out.println(callBackThread.getName());
        System.out.println("--------------注册回调信息线程关闭");
        Thread.currentThread().interrupt();

    }


}

