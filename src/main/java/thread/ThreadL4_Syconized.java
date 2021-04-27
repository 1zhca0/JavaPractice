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
public class ThreadL4_Syconized {

    private static volatile Object resourceA = new Object();
    private static volatile Object resourceB = new Object();

    @SneakyThrows
    public static void main(String[] args) {

        Thread threadA = new Thread(new Runnable() {

            @Override
            @SneakyThrows(InterruptedException.class)
            public void run() {
                synchronized (resourceA) {
                    System.out.println("threadA get resourceA");
                    resourceA.wait();
//                    synchronized (resourceB) {
//                        System.out.println("threadA get resourceB lock");
//                        System.out.println("threadA release resourceA lock");
//
//                        // 程序执行了 同步对象 wait 方法 ，当前线程暂停，释放锁
//
//                        resourceB.wait();
//
//                    }
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {

            @Override
            @SneakyThrows(InterruptedException.class)
            public void run() {
                Thread.sleep(1000);
                synchronized (resourceA) {
                    System.out.println("threadB get resourceA");
                    System.out.println("threadB trying to get resourceB lock...");
                    resourceA.wait();

//                    synchronized (resourceB) {
//                        System.out.println("threadB get resourceB lock");
//                        System.out.println("threadB release resourceA lock");
//
//                    }
                }
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("main over");
    }


}
