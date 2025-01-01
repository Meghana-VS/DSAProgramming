package arrays.brute;

import java.util.List;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    //TC=o(n^2), SC=o(1)
    public static void main(String[] args) {
        int a[] = {3,2,4};
        int target = 6;
        int[] result = findPair(a,target);
        System.out.print(result[0]+","+result[1]);
    }
    static int[] findPair(int[] a, int target){
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] + a[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}
