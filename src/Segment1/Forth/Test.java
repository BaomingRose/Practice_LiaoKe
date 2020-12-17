package Segment1.Forth;

public class Test {
    public static void main(String[] args) {
        Customer routine = new Routine_Customer();
        Customer vip = new Vip_Customer();
        Customer inner = new Inner_Customer();

        System.out.println("常规顾客花费:" + routine.consume(100));
        System.out.println("vip顾客花费:" + vip.consume(100));
        System.out.println("内部员工花费:" + inner.consume(100));
    }
}
