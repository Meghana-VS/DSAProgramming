package arrays.optimal;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK_HashMap {
//    TC = o(n), SC = o(n)
    public static void main(String[] args) {
//        int arr[] = {10, 5, 2, 7, 1, 9};
//        int k = 15;
        int arr[] = {1,2,1,2,1};
        int k = 3;
        System.out.println(subArray(arr,k));
    }

    static int subArray(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();

        for(int i=0; i<n; i++){
            sum += nums[i];

            if(sum == k){
                maxLen = i+1;
            }
            if(sumMap.containsKey(sum - k)){
                maxLen = Math.max(maxLen, i - sumMap.get(sum-k));
            }
            sumMap.putIfAbsent(sum, i);
        }
        return maxLen;
    }
}
