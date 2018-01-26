package com.itheima.example2;

public class Example2 {
    public static void main(String[] args){
        Car c=new Car();
        c.setNum(-1);
        c.setColor("red");
        c.run();
        int a=c.getNum();
        String s=c.getColor();
        System.out.println(a+s);
    }
}
