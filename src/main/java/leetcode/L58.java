package leetcode;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L58
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/7/16 11:00
 * @Version: 1.0
 */
public class L58 {
    public int lengthOfLastWord(String s) {

        String[] sArray = s.split(" ");
        return sArray.length == 0? 0 : sArray[sArray.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new L58().lengthOfLastWord("Hello World"));
    }
}
