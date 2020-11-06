package basic._202008_.threads;

public class TestThreadStatus {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("//////");
        });

        Thread.State state = thread.getState();
        System.out.println(state);

        // after starting
        thread.start();
        state = thread.getState();
        System.out.println(state);


    }


}
