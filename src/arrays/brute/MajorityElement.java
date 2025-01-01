package arrays.brute;
//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
//    TC = o(n^2), SC = o(1)
    public static void main(String[] args) {
//        int[] a = {3,2,3};
        int[] a = {2,2,1,1,1,2,2};
        System.out.println(findElement(a));
    }
    static int findElement(int[] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0;j<n; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count > n/2) return a[i];
        }
        return -1;
    }
}
