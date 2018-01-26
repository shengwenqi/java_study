package Chapter5;
import java.io.*;

public class Example4 {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream output = null;
        try
        {
            output = new FileOutputStream("swq.txt");
            String s = "I love you !";
            byte[] arr = s.getBytes();
            for(int i = 0; i < arr.length; i++)
            {
                output.write(arr[i]);
            }
        }
        catch(Exception e)
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

        FileInputStream input = null;
        try
        {
            input = new FileInputStream("swq.txt");
            int i = 0;
            while(true)
            {
                i = input.read();
                if(i == -1)
                {
                    break;
                }
                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            input.close();
        }
    }
}
