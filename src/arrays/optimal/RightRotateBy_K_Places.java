package arrays.optimal;

//https://leetcode.com/problems/rotate-array/description/
public class RightRotateBy_K_Places {
    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5,6,7};
        int a[] = {-1,-100,3,99};
        int k = 6;   // k=6 is nothing but (size of a[] + remaining num). 4+2(k%n) = 6(k)
        int n = a.length;
        rotateRight(a,n,k);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    static void rotateRight(int[] a,int n, int k){
        k = k % n;
        reverse(a, 0, n-k-1);
        reverse(a, n-k, n-1);
        reverse(a, 0, n-1);
    }
    static void reverse(int a[], int start, int end){
        while(start <= end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
