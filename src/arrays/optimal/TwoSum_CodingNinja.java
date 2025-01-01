package arrays.optimal;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/reading_6845742?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
public class TwoSum_CodingNinja {
    public static void main(String[] args) {
        int[] a = {575, 330, 339, 584, 239, 31, 173, 929, 967};
        int target = 204;
        System.out.println(findPair(a,target));
    }
    static String findPair(int[] a, int target) {
        int n = a.length;
        int left = 0, right = n-1;
        Arrays.sort(a);
        while (left < right){
            int sum = a[left] + a[right];
            if(sum == target){
                return "YES";
            }
            else if(sum < target) left++;
            else right--;
        }
        return "NO";
    }
}
