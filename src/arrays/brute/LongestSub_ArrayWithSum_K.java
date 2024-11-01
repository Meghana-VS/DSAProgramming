package arrays.brute;
//https://leetcode.com/problems/subarray-sum-equals-k/
public class LongestSub_ArrayWithSum_K {
    //TC = o(n^2), SC = o(1)
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(subArray(arr,k));
    }
    static int subArray(int a[], int k){
        int n = a.length;
        int length = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += a[j];

                if(sum == k){
                    length = Math.max(length, j-1+1);
                }
            }
        }
        return length;
    }
}
