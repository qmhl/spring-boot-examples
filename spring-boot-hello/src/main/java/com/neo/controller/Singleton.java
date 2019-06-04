package com.neo.controller;

public class Singleton {

//    双重检查  饿汉式
    private static Singleton singleton ;
//     无参构造
    private Singleton () {}
//
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }

            }
        }
        return singleton;

    }

}
