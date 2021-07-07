package leetcode;

import java.util.Arrays;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L26
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/7/7 11:23
 * @Version: 1.0
 */
public class L26 {

    public static  int removeDuplicates(int[] nums) {
        int i = 0,j = 1;
        while (j < nums.length){
            if (nums[i] == nums[j]){
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
