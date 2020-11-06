package basic._202008_.threads;

public class L5Daemon implements Runnable{

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread daemonThread = new Thread(new MyDaemon());
        Thread normalThread = new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.println("Normal Thread " + i);
            }
            System.out.println("==Normal Stopped==");
        });
        daemonThread.setDaemon(true);

        normalThread.start();
        daemonThread.start();
    }
}

class MyDaemon implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Daemon Thread " + i);
        }
        System.out.println("==Daemon Stoped==");
    }
}