package com.neo.controller;

import java.lang.reflect.Method;

public class FansheDemo {


    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.neo.controller.test002");
            //获取本类的所有方法，存放入数组
            System.out.println("========="+clazz);

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {

                System.out.println("方法名："+method.getName());
                //获取本方法所有参数类型，存入数组
                Class<?>[] getTypeParameters = method.getParameterTypes();
                if(getTypeParameters.length==0){

                    System.out.println("此方法无参数");
                }
                for (Class<?> class1 : getTypeParameters) {
                    String parameterName = class1.getName();
                    System.out.println("参数类型："+parameterName);
                }
                System.out.println("****************************");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class test002 {

    public void test01(){
        System.out.println("我是tset01");
    }
    public void t1(){}
    public void t2(String sss){}
    public void t3(Integer integer,Boolean boo){}
}