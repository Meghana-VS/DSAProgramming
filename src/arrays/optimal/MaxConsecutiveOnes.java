package arrays.optimal;

//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
//        int[] a = {1,1,0,1,1,1};
        int[] a = {1,0,1,1,0,1};
        System.out.println(maxCount(a));
    }
    static int maxCount(int[] a){
        int n = a.length;
        int maxOnes = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(a[i] == 1){
                count++;
            }else{
                count = 0;
            }
            maxOnes = Math.max(count,maxOnes);
        }
        return maxOnes;
    }
}
