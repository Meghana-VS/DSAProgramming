package arrays.optimal;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK_Optimal {
//    TC = o(n), SC = o(n)
    public static void main(String[] args) {
//        int arr[] = {10, 5, 2, 7, 1, 9};
//        int k = 15;
        int arr[] = {1,2,1,2,1};
        int k = 3;
        System.out.println(subArray(arr,k));
    }

    static int subArray(int[] a, int k) {
        int n = a.length;
        int left = 0, right = 0;
        int maxLen = 0;
        int sum = 0;

        while(right < n){
            sum += a[right];

            while(left <= right && sum > k){
                sum = sum - a[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}
