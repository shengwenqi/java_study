package com.itheima.example8;

public class Example8 {
    public static void main(String[] args){
        Animal a1=new Cow();
        Animal a2=new Sheep();
        animalCall(a1);
        animalCall(a2);
    }

    public static void animalCall(Animal a){
        a.call();
    }
}
