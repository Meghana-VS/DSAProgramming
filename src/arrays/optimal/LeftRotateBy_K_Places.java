package arrays.optimal;

public class LeftRotateBy_K_Places {
    public static void main(String[] args) {
        int[] a= {3,7,8,9,10,11};
//        int a[] = {1,2,3,4,5,6,7};       // {2,1}, {7,6,5,4,3}, {3,4,5,6,7,1,2}
        int k = 2;
        int n = a.length;
        rotateLeft(a,k,n);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    static void rotateLeft(int a[], int k, int n){
        reverse(0,k-1,a);
        reverse(k,n-1, a);
        reverse(0,n-1, a);
    }
    static void reverse(int start, int end, int[] a){
        int n = a.length;

        while(start <= end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
