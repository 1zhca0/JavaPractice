package basic.oct242020;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        int x,y,z;
        List<Integer> result = new ArrayList<>();
        for (int i = 101; i < 1000; i++) {
            x = i/100;
            y = i%100/10;
            z = i%10;

            if (x*x*x+y*y*y+z*z*z == i){
                System.out.println(i);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
