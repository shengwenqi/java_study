package com.itheima.example10;

public class Example10 {
    public static void main(String[] args)
    {
        try
        {
            int res=calculate(5,0);
            System.out.println(res);
            return;
        }
        catch(Exception e)
        {
            System.out.println("捕获的异常是："+e.getMessage());

        }
        finally
        {
            System.out.println("finally代码块");

        }
        System.out.println("程序代码继续执行。。");
    }

    public static int calculate(int a, int b)
    {
        int res=a/b;
        return res;
    }
}
