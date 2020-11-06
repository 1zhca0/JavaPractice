package basic._202010_;

public class Test4 {
    public static void main (String[] args) {
        for (int i = 1; i < 37; i++) {
            int result = found(i);
            System.out.println("第 " + i + "个月结果是： " + result);
        }
    }

    private static int found (int n) {

        if (n == 1 || n == 2)
            return 1;
        else
            return (found(n - 1) + found(n - 2));
    }
}
