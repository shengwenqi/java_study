package Chapter5;
import java.io.*;

public class Example6 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream input = new FileInputStream(".\\src\\woman.jpg");
        FileOutputStream output = new FileOutputStream(".\\woman.jpg");
        byte[] buffer = new byte[1024];
        int a;
        long startTime = System.currentTimeMillis();
        while((a = input.read(buffer)) != -1)
        {
            output.write(buffer,0,a);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制图片所消耗的时间是："+(endTime-startTime)+"毫秒");
        input.close();
        output.close();
    }
}
