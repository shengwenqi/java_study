package Chapter5;
import java.io.*;

public class Example3 {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream output = null;
        try
        {
            output = new FileOutputStream("output_test.txt",true);
            String s = "www.baidu.com";
            byte[] arr = s.getBytes();
            for(int i = 0; i < arr.length; i++)
            {
                output.write(arr[i]);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(output != null)
            {
                output.close();
            }
        }
    }
}
