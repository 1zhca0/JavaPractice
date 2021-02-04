package leetcode;

import java.util.Arrays;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L643
 * @Author: Frank.Cao
 * @Description: Lession643
 * @Date: 2021/2/4 10:28
 * @Version: 1.0
 */
public class L643 {

    public static double findMaxAverage(int[] nums, int k) {

        double sum = 0.0;
        boolean isfirst = true;

        for (int i = 0; i < nums.length; i++) {
            int end = i + k;
            if (end > nums.length){
                break;
            }
            int[] tempArray = Arrays.copyOfRange(nums, i, end);
            long tempSum = 0;
            for (int j = 0; j < tempArray.length; j++) {
                tempSum = tempSum + tempArray[j];
            }
            if(isfirst || tempSum > sum){
                sum = tempSum;
                isfirst = false;
            }

        }
        double d = sum/(double)k;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{-1}, 1));
//        System.out.println(-1/1);
    }

}

