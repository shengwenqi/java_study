package Chapter4.example1;
import java.util.*;

public class Example6 {
    public static void main(String[] args)
    {
        HashMap hashMap = new HashMap();
        hashMap.put("001","zhangsan");
        hashMap.put("002","lisi");
        hashMap.put("003","wangwu");
        Set keySet = hashMap.keySet();
        Iterator it = keySet.iterator();
        while(it.hasNext())
        {
            Object key = it.next();
            Object value = hashMap.get(key);
            System.out.println(key+"="+value);
        }
    }
}
