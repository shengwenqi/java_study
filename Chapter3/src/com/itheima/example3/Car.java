package com.itheima.example3;

public class Car {
    public Car(){
        System.out.println("无参数的构造方法执行了。。");
    }

    public Car(String color){
        this();
        System.out.println("有参数的构造方法执行了");
    }
}
