package basic._202010_;

public class Test5 {

    public static void main(String[] args) {
        int count = 0;
        int peachNum = 1;//定义桃子的数量
        int tmp = 1;
        while (true) {
            tmp = peachNum;
            for (count = 0; count < 5; count++) {
                if ((tmp - 1) % 5 == 0) {
                    tmp = (tmp - 1) / 5 * 4;
                } else {
                    break;
                }
            }
            if (count == 5) {
                break;
            }
            peachNum++;
        }
        System.out.println("海滩原有: " + peachNum + " 个桃子");
    }
}
