package Chapter4.example1;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        System.out.println("集合的长度是："+list.size());
        System.out.println("第2个元素是："+list.get(2));
    }
}
