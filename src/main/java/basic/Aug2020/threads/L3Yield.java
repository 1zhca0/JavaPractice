package basic.Aug2020.threads;

public class L3Yield {
    public static void main(String[] args) {
        MyYield m = new MyYield();
        new Thread(m, "a").start();
        new Thread(m, "b").start();
    }
}

class MyYield implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " is stoping");
    }
}
