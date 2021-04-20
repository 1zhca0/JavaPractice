package thread;

public class BasicThread {
    public static void main(String[] args) {
        TestThread1 t1 = new TestThread1();
        t1.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("rest" + i);
        }
    }
}

class TestThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("working" + i);
        }
    }
}