package basic._202010_;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(i!=j&&i!=k&&j!=k){
                        result.add(100*i+10*j+k);
                        System.out.println(100*i+10*j+k);
                    }
                }
            }
        }
        System.out.println("共有： " + result.size() + " 个数字。");
    }
}
