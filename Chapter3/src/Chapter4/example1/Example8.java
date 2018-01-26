package Chapter4.example1;
import java.util.*;

public class Example8 {
    public static void main(String[] args)
    {
        Properties p = new Properties();
        p.setProperty("face","微软雅黑");
        p.setProperty("size","20px");
        p.setProperty("color","green");
        Set<String>names = p.stringPropertyNames();
        for(String key : names)
        {
            String value = p.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
