package basic.Aug2020.threads;

public class L1Base implements Runnable{
    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new Thread(()-> System.out.println("helki")).start();
    }
}
