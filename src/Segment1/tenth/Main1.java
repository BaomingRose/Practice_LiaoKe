package Segment1.tenth;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main1 {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("out/java1.txt");
        OutputStream out = new FileOutputStream("out/java2.txt");
        int len;
        long beginTime = System.currentTimeMillis();
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝文件所需时间为：" + (endTime - beginTime) + "毫秒");

        out.close();
        in.close();
    }
}
