package arrays.optimal;

public class MissingNumber {
    //TC = o(n), SC = o(1)
    public static void main(String[] args) {
        int[] a = {3,0,1};
//        int a[] = {1, 2, 4, 5};
//        int[] a = {0,1};
//        int[] a = {1};
//        int[] a = {9,6,4,2,3,5,7,0,1};
        System.out.println(findNum(a));
    }
    static int findNum(int[] a){
        int n = a.length;
        int sum = 0;
        int expectedSum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            maxi = Math.max(maxi,a[i]);
            sum = sum + a[i];
        }
        if(n < maxi){
            expectedSum = (maxi * (maxi + 1)) / 2;
        }else {
            expectedSum = (n * (n + 1)) / 2;
        }

        int missingNum = expectedSum - sum;
        return missingNum;
    }
}
