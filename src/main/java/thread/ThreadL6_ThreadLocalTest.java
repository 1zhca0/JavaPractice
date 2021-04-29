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
public class ThreadL6_ThreadLocalTest {

    private static ThreadLocal<String> localVarible = new ThreadLocal<>();

    public static void main(String[] args) {
        Thread threadOne = new Thread(
                ()->{
                    localVarible.set("threadOne local variable");
//                    print("threadOne");
                    System.out.println("threadOne remove after: " + localVarible.get());
                }
        );

        Thread threadTwo = new Thread(
                ()->{
                    localVarible.set("threadTwo local variable");
                    localVarible.remove();
                    System.out.println("threadTwo remove after: " + localVarible.get());
                }
        );

        Thread thread3 = new Thread(
                ()->{
                    localVarible.set("thread3 local variable");
                    System.out.println("thread3 remove after: " + localVarible.get());
                }
        );

        threadOne.start();
        threadTwo.start();
        thread3.start();

    }


}
