package basic._202008_.threads;


public class L2龟兔赛跑 implements Runnable{

    public String winner="";

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("兔子")){
//            Thread.currentThread().sleep(1000);
        }



        for (int i = 1; i <= 100; i++) {
            if (!winner.isEmpty()){
                break;
            }
            System.out.println(Thread.currentThread().getName() + " running " + i);
            if (i==100){
                winner=Thread.currentThread().getName();
                System.out.println("winner : " + winner);
                break;
            }
        }
    }
//    public 龟兔赛跑(){
//
//    }

    public static void main(String[] args) {
        L2龟兔赛跑 race = new L2龟兔赛跑();
        new Thread(race, "乌龟").start();
        new Thread(race, "兔子").start();

    }
}
