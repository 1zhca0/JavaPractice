package thread;

import lombok.SneakyThrows;

/**
 * @ProjectName: JavaPractice
 * @Package: thread
 * @ClassName: ThreadL4_Syconized
 * @Author: Frank.Cao
 * @Description: 线程同步
 * @Date: 2021/4/26 15:51
 * @Version: 1.0
 */
public class ThreadL5_Syconized {

    private static volatile Object resourceA = new Object();
    private static volatile Object resourceB = new Object();

    @SneakyThrows
    public static void main(String[] args) {

        Thread threadA = new Thread(new Runnable() {

            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(1000000);
            }
        });

        threadA.start();
        System.out.println("主线程继续");
        Thread.sleep(1000);
        threadA.interrupt();
        System.out.println(threadA.isAlive());
        System.out.println(threadA.isInterrupted());
        threadA.join();
        System.out.println(threadA.isAlive());
        System.out.println(threadA.isInterrupted());
        System.out.println("all finined");
    }


}
