package basic.Aug2020.threads;


import java.util.ArrayList;
import java.util.List;

public class L6Unsafebank {

    public static void main(String[] args) throws InterruptedException {
//        Account life = new Account(100, "life");
//        GetMoney frank = new GetMoney(life, 20);
//        GetMoney wife = new GetMoney(life, 100);
//
//        new Thread(wife, "wife").start();
//        new Thread(frank, "frank").start();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int finalI = i;
            new Thread(()->{
               list.add(finalI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

        }
//        Thread.sleep(30000);
        System.out.println("list.size() - " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the " + i + " -  " + list.get(i));
        }
        System.out.println("list.size() - " + list.size());
    }
}

class Account{
    int money;
    String name;

    Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

class GetMoney implements Runnable{

    private Account account;
    private int getMoney;

    GetMoney(Account account, int getMoney){
        this.account = account;
        this.getMoney = getMoney;
    }

    @Override
    public void run() {
        if (getMoney>account.money) {
            System.out.println("no enough money");
            return;
        }
        System.out.println(Thread.currentThread().getName() + " get : " + getMoney);
        account.money = account.money - getMoney;
        System.out.println(account.name + " Left money : " + account.money);
    }

}
