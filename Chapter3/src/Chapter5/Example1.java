package Chapter5;
import java.io.*;

public class Example1 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream input = new FileInputStream("test.txt");
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
        input.close();
    }
}
