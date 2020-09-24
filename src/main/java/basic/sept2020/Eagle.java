package basic.sept2020;

import java.sql.SQLOutput;

public class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + " fly");
    }
}
