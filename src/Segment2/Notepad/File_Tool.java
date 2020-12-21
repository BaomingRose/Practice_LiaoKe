package Segment2.Notepad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class File_Tool {
    public static void write_file(String file_name, String text) throws Exception {
        //字符流写文件
        FileWriter writer = new FileWriter(file_name);
        writer.write(text);
        writer.close();
    }

    public static String read_file(String file_name) throws Exception {
        FileReader reader = new FileReader(file_name);
        // 包装流，提高读写效率
        BufferedReader br = new BufferedReader(reader);

        StringBuilder stringBuffer = new StringBuilder("");
        String str;
        while ((str = br.readLine()) != null) {
            stringBuffer.append(str);
            stringBuffer.append('\n');
        }
        br.close();
        return stringBuffer.toString();
    }
}
