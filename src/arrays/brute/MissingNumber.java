package arrays.brute;

//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    //TC = o(n^2), SC = o(1)
    public static void main(String[] args) {
//        int[] a = {3,0,1};
//        int a[] = {1, 2, 4, 5};
//        int[] a = {0,1};
        int[] a = {1};
        System.out.println(findNum(a));
    }
    static int findNum(int[] a){
        int n = a.length;
        for(int i=0; i<=n; i++){
            int flag = 0;
            for(int j=0; j<n; j++){
                if(a[j] == i){
                    flag++;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        // It is just to avoid warnings.
        return -1;
    }
}
