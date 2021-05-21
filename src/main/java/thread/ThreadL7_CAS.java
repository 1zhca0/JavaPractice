package thread;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ProjectName: JavaPractice
 * @Package: thread
 * @ClassName: Thread7_CAS
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/5/6 14:58
 * @Version: 1.0
 */
public class ThreadL7_CAS {

    static AtomicInteger integer = new AtomicInteger();

    static void increment(){
        integer.incrementAndGet();
    }
}
