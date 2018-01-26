package Chapter5;
import java.io.*;

public class Example5 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream input = new FileInputStream("./src/woman.jpg");
        FileOutputStream output = new FileOutputStream("./src/Chapter5/woman.jpg");
        int a;
        long startTime = System.currentTimeMillis();
        while((a = input.read()) != -1)
        {
            output.write(a);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制图片所消耗的时间是："+(endTime-startTime)+"毫秒");
        input.close();
        output.close();
    }
}
