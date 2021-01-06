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
        // 思路: 遍历字符串, 每一次遍历都寻找当前字符到末尾的回文串,
        // 取最长值放入缓存, 每次获取到回文串即与此长度对比
        String result = "";
        List<String> resultList = new ArrayList<>();
        StringBuffer temp = new StringBuffer();
        // 思路: 遍历字符串, 每一次遍历都寻找当前字符到末尾的回文串,
        // 取最长值放入缓存, 每次获取到回文串即与此长度对比
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                temp.append(s.charAt(j));
                int tempLength = temp.toString().length();
                if (tempLength>=2){
                    for (int k = 0; k < tempLength / 2; k++) {
                        if (temp.toString().toCharArray()[i] != temp.toString().toCharArray()[tempLength - 1 - i]) {
                            continue;
                        } else {
                            result = temp.toString();
                        }
                    }
                }
            }
            temp.delete(0, temp.length());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
