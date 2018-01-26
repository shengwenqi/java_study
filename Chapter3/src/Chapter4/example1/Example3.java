package Chapter4.example1;
import java.util.*;

public class Example3 {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        for(Object obj : list)
        {
            System.out.println(obj);
        }
    }
}
