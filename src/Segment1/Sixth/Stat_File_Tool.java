package Segment1.Sixth;

import java.io.BufferedReader;
import java.io.FileReader;

public class Stat_File_Tool {
    //根据文件名统计文件字符个数
    public static int count_char_file(String file_name) throws Exception {
        FileReader reader = new FileReader(file_name);
        int count = 0;
        while (reader.read() != -1) {
            ++count;
        }
        reader.close();
        return count;
    }

    //根据文件名统计文件单词个数
    public static int count_word_file(String file_name) throws Exception {
        int count = 0;
        FileReader reader = new FileReader(file_name);
        BufferedReader br = new BufferedReader(reader);

        String line;
        while ((line = br.readLine()) != null) {
            String[] word = line.trim().split(" ");
            for (String s : word) {
                if (!s.isEmpty()) {
                    count++;
                }
            }
        }

        reader.close();
        br.close();
        return count;
    }

    //根据文件名统计文件行数
    public static int count_line_file(String file_name) throws Exception {
        int count = 0;
        FileReader reader = new FileReader(file_name);
        BufferedReader br = new BufferedReader(reader);

        while (br.readLine() != null) {
            ++count;
        }

        reader.close();
        br.close();
        return count;
    }
}

