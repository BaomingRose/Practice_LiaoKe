package Segment1.tenth;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("out/java1.txt"));
        //这两个流内部定义了一个大小为8192的字节数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("out/java2.txt"));

        int len;
        long beginTime = System.currentTimeMillis();
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("拷贝文件所需时间为：" + (endTime - beginTime) + "毫秒");
        bis.close();
        bos.close();
    }
}
