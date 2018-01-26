package com.itheima.example2;

public class Car {
    private String color;
    private int num;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int carNum){
        if(carNum!=4){
            System.out.println("输入的轮胎数量不正确！");
        }
        else{
            num=carNum;
        }
    }

    public void run(){
        System.out.println("这辆车的颜色是"+color+"，轮胎数量是"+num);
    }
}
