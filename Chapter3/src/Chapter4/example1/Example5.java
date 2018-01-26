package Chapter4.example1;
import java.util.*;

public class Example5 {
    public static void main(String[] args)
    {
        HashSet hashSet = new HashSet();
        hashSet.add("zhangsan");
        hashSet.add("lisi");
        hashSet.add("wangwu");
        hashSet.add("lisi");
        Iterator it = hashSet.iterator();
        while(it.hasNext())
        {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
