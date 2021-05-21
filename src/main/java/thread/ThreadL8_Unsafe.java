package thread;

import com.sun.org.apache.xpath.internal.operations.Bool;
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
public class ThreadL8_Unsafe {

    // 获取unsafe实例
    static final Unsafe unsafe = Unsafe.getUnsafe();
    static long stateOffset;
    private volatile long state = 0;

    static {
        try {
            stateOffset = unsafe.objectFieldOffset(ThreadL8_Unsafe.class.getDeclaredField("state"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadL8_Unsafe test = new ThreadL8_Unsafe();
        Boolean sucess = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(sucess);
    }
}
