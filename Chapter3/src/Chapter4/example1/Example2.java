package Chapter4.example1;

import java.util.*;

public class Example2 {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
