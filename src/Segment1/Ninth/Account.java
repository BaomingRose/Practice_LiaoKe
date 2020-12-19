package Segment1.Ninth;

//封装账户类，属性有余额，保证余额变量的安全多线程改变余额时需要加锁
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void save_money(double a) {
        this.balance += a;
        System.out.println("存钱成功！！余额为：" + this.getBalance());
    }

    public synchronized void get_money(double a) {
        if (this.balance >= a) {
            this.balance -= a;
            System.out.println("取钱成功！！余额为：" + this.getBalance());
        } else {
            System.out.println("你的余额不足！！余额为：" + this.getBalance());
        }
    }
}
