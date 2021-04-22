package thread;

/**
 * @ProjectName: JavaPractice
 * @Package: thread
 * @ClassName: ThreadL2
 * @Author: Frank.Cao
 * @Description: 线程状态
 * @Date: 2021/4/22 17:10
 * @Version: 1.0
 */
public class ThreadL2 implements Runnable{
    private boolean status = true;

    @Override
    public void run() {
        int i = 0;
        while (status){
            if (i == 99){
                stop();
            }
            System.out.println("this is --> " + i++);
        }
    }

    private void stop (){
        this.status = false;
    }

    public static void main(String[] args) {
        ThreadL2 l2 = new ThreadL2();
        new Thread(l2).start();

    }
}
