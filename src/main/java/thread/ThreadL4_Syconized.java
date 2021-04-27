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

    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station, "1").start();
        new Thread(station, "2").start();
        new Thread(station, "3").start();


    }


}

class BuyTicket implements Runnable{

    private int ticketNum = 20;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            buy();
        }
    }

    @SneakyThrows
    void buy(){
        if (ticketNum < 0){
            flag = false;
            return;
        }

        Thread.sleep(100);

        System.out.println(Thread.currentThread().getName() + " buy ticket " + ticketNum--);
    }
}
