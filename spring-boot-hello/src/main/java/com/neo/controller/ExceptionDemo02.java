package com.neo.controller;


class FuShuException extends Exception {//getMessage();
    private int value;
   /* public FuShuException() {
        super();
    }
    public FuShuException(String msg,int value) {
        super(msg);
        this.value=value;
    }
    public int getValue() {
        return value;
    }*/

    public FuShuException(String message) {
        super(message);
    }

    public FuShuException(String message, int value) {
        super(message);
        this.value = value;
    }




    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class Demo02{
    int div(int a,int b) throws FuShuException{
        if(b<0) {
            throw new FuShuException("出现了除数是负数的情况");//手动通过throw关键字抛出一个自定义异常对象。
        }
        return a/b;
    }
}
public class ExceptionDemo02 {
    public static void main(String[] args) {
        Demo02 d=new Demo02();
        try {
            int x=d.div(4, -1);
            System.out.println("x:"+x);
        }catch (FuShuException e) {
            System.out.println(e.toString());
            System.out.println("======="+e.getMessage()+"=======");

//            System.out.println("除数出现负数了");
            System.out.println("错误的负是："+e.getValue());
        }
        System.out.println("over");
    }
}