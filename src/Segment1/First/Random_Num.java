package Segment1.First;

public class Random_Num {
    public static int[] Count_Random() {
        int[] arr = new int[30];
        System.out.println("随机数数位和大于6的有：");
        for (int i = 0; i < 30; i++) {
            //生成随机数
            arr[i] = (int)(Math.random() * 1000);
            if (count_digit_sum(arr[i]) > 6) {
                System.out.print(arr[i] + " ");
            }
        }
        return arr;
    }

    //计算一个数的各数位和
    public static int count_digit_sum(int num) {
        int res = 0;
        while (num != 0) {
            res += (num % 10);
            num /= 10;
        }
        return res;
    }
}

class Test {
    public static void main(String[] args) {
        int[] arr = Random_Num.Count_Random();
        System.out.println();
        System.out.println("随机数有：");
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
