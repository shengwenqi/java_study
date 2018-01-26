package Chapter4.example1;
import java.util.*;

public class Example7 {
    public static void main(String[] args)
    {
        HashMap hashMap = new HashMap();
        hashMap.put("001","zhangsan");
        hashMap.put("002","lisi");
        hashMap.put("003","wangwu");
        Set entrySet = hashMap.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext())
        {
            Map.Entry entry = (Map.Entry)it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
