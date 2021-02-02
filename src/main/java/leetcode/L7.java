package leetcode;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L7
 * @Author: Frank.Cao
 * @Description: lession7
 * @Date: 2021/2/2 10:40
 * @Version: 1.0
 */
public class L7 {
    public static int reverse(int x) {
        long result = 0;
        while(x!=0){
            result = result * 10 + x%10;
            x = x/10;
        }
        return -(int) (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE ? 0 : result);
    }

    public static void main(String[] args) {
//        System.out.println(1/10);
        int result = reverse(-1534236469);
        System.out.println(result);
    }
}
