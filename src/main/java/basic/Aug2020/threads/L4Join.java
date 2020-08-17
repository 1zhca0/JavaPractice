package basic.Aug2020.threads;

public class  L4Join implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread : " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        L4Join joinTest = new L4Join();
        Thread thread = new Thread(joinTest);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            if (i==200)
                thread.join();
            System.out.println("main : " + i);
        }
    }
}