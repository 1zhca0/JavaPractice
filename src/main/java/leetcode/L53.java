package leetcode;

/**
 * @Date: 2021/7/12 11:17
 */
public class L53 {

    public int maxSubArray(int[] nums) {
        int nums_max = 0;
        int res_max = 0;

        for (int num: nums) {
            nums_max = Math.max(num, nums_max + num);
            res_max = Math.max(res_max, nums_max);
        }

        return res_max;
    }

    public static void main(String[] args) {
        int[] param = new int[]{0,1,2};
        L53 l = new L53();
        System.out.println(l.maxSubArray(param));
    }
}