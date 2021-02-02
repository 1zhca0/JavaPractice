package leetcode;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L9
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/2/2 11:20
 * @Version: 1.0
 */
public class L9 {

    public static boolean isPalindrome(int x) {

        int temp = x;
        if(x<0){
            return false;
        }

        long reverseInt = 0;
        while(x!=0){
            reverseInt = reverseInt * 10 + x%10;
            x = x/10;
        }

        reverseInt = reverseInt >= Integer.MAX_VALUE ? 0 : reverseInt;
        if((int)reverseInt == temp){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
