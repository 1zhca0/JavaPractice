package basic._202009_;

public class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + " fly");
    }
}
