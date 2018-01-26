package Chapter5;
import java.io.*;

public class Example2 {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream output = new FileOutputStream("output_test.txt");
        String s = "www.itheima.com";
        byte[] arr = s.getBytes();
        for(int i = 0; i < arr.length; i++)
        {
            output.write(arr[i]);
        }
        output.close();
    }
}
