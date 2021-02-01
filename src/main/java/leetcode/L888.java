package leetcode;

import java.util.Arrays;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L888
 * @Author: Frank.Cao
 * @Description: 888lession
 * @Date: 2021/2/1 10:28
 * @Version: 1.0
 */
public class L888 {
    public static int[] fairCandySwap(int[] A, int[] B) {

        int[] ans = new int[2];
        int sumA = 0, sumB = 0;
        for(int i: A){
            sumA += i;
        }
        for(int j: B){
            sumB += j;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int temp = (sumA-sumB)/2;
        System.out.println(temp);
        int i = 0, j = 0;
        while(i<A.length&&j<B.length){
            if(A[i]-B[j]==temp){
                ans[0] = A[i];
                ans[1] = B[j];
                break;
            }
            else if(A[i]-B[j]>temp){
                j++;
            }
            else if(A[i]-B[j]<temp){
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int A[] = {2}, B[] = {1,3};
        System.out.println(Arrays.toString(fairCandySwap(A, B)));
    }
}
