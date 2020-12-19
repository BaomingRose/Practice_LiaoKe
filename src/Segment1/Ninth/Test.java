package Segment1.Ninth;

public class Test {
    public static void main(String[] args) {
        Account a = new Account(100);
        T1 get = new T1(a);
        T2 save = new T2(a);

        Thread thread1 = new Thread(get);
        Thread thread2 = new Thread(save);

        thread1.start();
        thread2.start();
    }
}

class T1 implements Runnable {
    private Account a;

    public T1(Account a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10000; i++) {
            this.a.get_money(200);
        }
    }
}

class T2 implements Runnable {
    private Account a;

    public T2(Account a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            this.a.save_money(100);
        }
    }
}

