package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L27
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/7/8 9:49
 * @Version: 1.0
 */
public class L27 {

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        int[] nums = stringToIntegerArray("[3,2,2,3,6,7,4,3,2,2,1,1]");
        int val = 3;

        int ret = new Solution().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);

        System.out.print(out);
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}

