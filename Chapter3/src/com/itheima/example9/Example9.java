package com.itheima.example9;

public class Example9 {
    public static void main(String[] args){
        animalCall(new Animal(){
            public void call(){
                System.out.println("哞。。");
            }
        });
    }

    public static void animalCall(Animal a)
    {
        a.call();
    }
}
