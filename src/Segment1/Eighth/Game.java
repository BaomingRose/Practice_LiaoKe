package Segment1.Eighth;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Game {
    //以下是两个线程通信的变量
    private int rand_num;   //生成的随机数
    private int guess_num;  //每次猜测的数字
    private int judge_result = -1;   //判断是否猜测结果，如果小了-1，大了1，正确为0

    private Lock lock = new ReentrantLock();
    private Condition guess_cond = lock.newCondition();
    private Condition judge_cond = lock.newCondition();

    //猜线程根据提示来确定范围
    private int rand_min = 0;
    private int rand_max = 100;

    public void rand_judge() {
        //先抢占锁资源生成随机数
        lock.lock();
        try {
            rand_num = (int)(Math.random() * 99 + 1);
            System.out.println("线程1：生成的随机数为：" + rand_num);
            //唤醒猜线程
            guess_cond.signal();
            //判断线程睡眠
            judge_cond.await();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //生成完随机数后释放锁资源
            lock.unlock();
        }

        //被唤醒时执行从此开始，先判断是否结束
        while (judge_result != 0) {
            lock.lock();

            try {
                if (guess_num < rand_num) {
                    System.out.println("线程1：猜小了！！！");
                    judge_result = -1;
                } else if (guess_num > rand_num) {
                    System.out.println("线程1：猜大了！！！");
                    judge_result = 1;
                } else {
                    System.out.println("线程1：猜对了！！！");
                    judge_result = 0;
                }
                guess_cond.signal();
                if (judge_result != 0) {
                    judge_cond.await();
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                lock.unlock();
            }
        }
    }

    public void guess() {
        while (judge_result != 0) {
            lock.lock();

            try {
                while (rand_num == 0) {
                    guess_cond.await();
                }
                if (judge_result == -1) {
                    rand_min = guess_num;
                } else if (judge_result == 1) {
                    rand_max = guess_num;
                }
                guess_num = (rand_min + rand_max) / 2;
                System.out.println("线程2猜测的随机数为：" + guess_num);
                judge_cond.signal();
                guess_cond.await();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                lock.unlock();
            }
        }
    }
}


