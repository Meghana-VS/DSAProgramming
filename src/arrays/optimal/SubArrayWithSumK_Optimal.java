package arrays.optimal;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/subarray-sum-equals-k/
//TWO POINTER APPROACH
public class SubArrayWithSumK_Optimal {
    public static void main(String[] args) {
//        int arr[] = {10, 5, 2, 7, 1, 9};
//        int k = 15;
//        int arr[] = {1,2,1,2,1};
        int arr[] = {1,1,1,1};
        int k = 3;
        System.out.println(subArray(arr,k));
    }
    static int subArray(int[] a, int k) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];

            if(sum == k){
                count += 1;
            }
            if(sumMap.containsKey(sum - k)){
                count += sumMap.get(sum - k);
            }

            sumMap.put(sum, sumMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
