package basic._202008_.threads;

public class L6UnsafeThreads {
    public static void main(String[] args) {

       BuyTicket b = new BuyTicket();
        new Thread(b).start();
        new Thread(b).start();
        new Thread(b).start();
    }
}

class BuyTicket implements Runnable {

    private  int Tickets = 10;
    private  boolean flag = true;
    @Override
    public void run() {
        while (flag)
            buy();
    }

    void buy(){

        if (Tickets<=0) {
            System.out.println("no ticket left");
            flag=false;
        }
        System.out.println(Thread.currentThread().getName() + " get No." + Tickets-- );
    }
}