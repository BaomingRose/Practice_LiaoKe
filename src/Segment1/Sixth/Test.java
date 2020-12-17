package Segment1.Sixth;

public class Test {
    public static void main(String[] args) {
        String file_name = "./out/a.txt";
        int count = 0;
        try {
            count = Stat_File_Tool.count_char_file(file_name);
        } catch (Exception o) {
            System.out.println(o);
        }
        System.out.println("该文件字符个数：" + count);

        try {
            count = Stat_File_Tool.count_line_file(file_name);
        } catch (Exception o) {
            System.out.println(o);
        }
        System.out.println("该文件行数：" + count);

        try {
            count = Stat_File_Tool.count_word_file(file_name);
        } catch (Exception o) {
            System.out.println();
        }
        System.out.println("该文件单词个数：" + count);
    }
}
