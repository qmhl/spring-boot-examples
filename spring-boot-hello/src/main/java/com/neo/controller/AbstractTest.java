package com.neo.controller;
import org.springframework.web.bind.annotation.ControllerAdvice;

public class AbstractTest {


    public static void main (String[] arg){
        Programmer pro = new Programmer("mahuateng","10000",10000);
        Manage man = new Manage("mayun","10086",88888,10000);
        pro.work();
        man.work();
    }

}

/**
 * 自定义抽象类
 */

abstract class Employee{
    private String name;
    private String id;
    private double pay;
    Employee (String name,String id,double pay){
        this.name = name;
        this.id = id;
        this.pay = pay;
    }
    public abstract void work();
}
class Programmer extends Employee{



    public Programmer(String name, String id, double pay) {
        super(name, id, pay);
    }

    public void  work(){
        System.out.println("职员工作是coding");
    }
}
class Manage extends Employee{
    private int bouns;


    public Manage(String name, String id, double pay, int bouns) {
        // 因为继承了父类  也就是也就是抽象类
        super(name, id, pay);
        this.bouns = bouns;
    }

    public void work(){
        System.out.println("manage");
    }
}

