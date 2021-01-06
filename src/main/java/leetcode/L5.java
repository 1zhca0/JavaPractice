package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L5
 * @Author: Frank.Cao
 * @Description: 回文串
 * @Date: 2021/1/6 11:14
 * @Version: 1.0
 */
public class L5 {

    public static String longestPalindrome(String s) {
        String result = "";
        int size = 0;
        List<String> resultList = new ArrayList<>();
        StringBuffer temp = new StringBuffer();
        // 思路: 遍历字符串, 每一次遍历都寻找当前字符到末尾的回文串,
        // 取最长值放入缓存, 每次获取到回文串即与此长度对比
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                temp.append(s.charAt(j));
                if (ifHuiwen(temp.toString()) && temp.toString().length()>size){
                    size = temp.toString().length();
                    result = temp.toString();
                } else {
                    continue;
                }
            }
            temp.delete(0, temp.length());
        }
        return result;
    }

    public static boolean ifHuiwen(String text){
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.toCharArray()[i] != text.toCharArray()[length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = longestPalindrome("babad");
        System.out.println(s);
    }
}
