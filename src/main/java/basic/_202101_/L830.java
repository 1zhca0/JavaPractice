package basic._202101_;

import java.util.*;

/**
 * @ProjectName: JavaPractice
 * @Package: basic._202101_
 * @ClassName: L830
 * @Author: Frank.Cao
 * @Description: LeetCodeLession830
 * @Date: 2021/1/5 10:30
 * @Version: 1.0
 */
public class L830 {
    public static List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> result = new ArrayList<>();

        int start = 0;
        char startVal = s.charAt(0);
        int end = 0;

        for (int i = 1; i < s.length(); i++) {

            if ((end - start )>=3 && s.charAt(i) != startVal){
                result.add(Arrays.asList(start, end));
            }

            if (s.charAt(i) == startVal){
                end++;
            }else {
                start = i;
                startVal = s.charAt(i);
                end = i;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        largeGroupPositions("abcccd");
    }
}
