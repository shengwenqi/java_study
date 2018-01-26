package Chapter4.example1;
import java.util.*;

public class Example4 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        for(String s : list)
        {
            String str = (String)s;
        }
    }
}
