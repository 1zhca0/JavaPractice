package leetcode;

import java.util.*;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L13
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/4/21 11:12
 * @Version: 1.0
 */
public class L13 {

    private static final String IV = "IV";
    private static final String IX = "IX";
    private static final String XL = "XL";
    private static final String XC = "XC";
    private static final String CD = "CD";
    private static final String CM = "CM";

    public static int romanToInt(String s) {

        s = s.toUpperCase();

        System.out.println("step1 -- > " + s);

        s = s.replaceAll(IV, "A");
        s = s.replaceAll(IX, "B");
        s = s.replaceAll(XL, "G");
        s = s.replaceAll(XC, "H");
        s = s.replaceAll(CD, "E");
        s = s.replaceAll(CM, "F");

        System.out.println("step2 -- > " + s);

        Map<Character, Integer> romanNumMap = new HashMap<>();
        romanNumMap.put('A', 4);
        romanNumMap.put('B', 9);
        romanNumMap.put('G', 40);
        romanNumMap.put('H', 90);
        romanNumMap.put('E', 400);
        romanNumMap.put('F', 900);
        romanNumMap.put('V', 5);
        romanNumMap.put('I',1);
        romanNumMap.put('X',10);
        romanNumMap.put('L',50);
        romanNumMap.put('C',100);
        romanNumMap.put('D',500);
        romanNumMap.put('M',1000);

        // return
        int resultVal = 0;
        for (int i = 0; i < s.length(); i++) {
            resultVal += romanNumMap.get(s.charAt(i));
        }

        return resultVal;
    }

    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
        System.out.println("result -- > " + i);

    }
}
