package basic.oct242020;

import java.lang.reflect.Method;

public class Test3 {

    public static void main(String[] args) {
        Jump(100,10);
    }
    public static void Jump(int height,int count){
        int countheight=height;
        int currentheight=height;
        if(count>0) {
            if (count == 1) {
                System.out.println("第1次反弹高度：" + height + "米");
                System.out.println("第1次反弹经过的距离：" + height + "米");
            } else {
                System.out.println("第1次高度：" + height + "米");
                System.out.println("第1次经过的距离：" + height + "米");
                System.out.println("");
                for (int i = 2; i <= count; i++) {
                    currentheight = currentheight / 2;
                    countheight = countheight + currentheight;
                    System.out.println("第" + i + "次高度：" + currentheight + "米");
                    System.out.println("第" + i + "次经过的距离：" + countheight + "米");
                    System.out.println("");
                }
            }
        }
        }
}
