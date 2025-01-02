package recursion;

//https://www.geeksforgeeks.org/problems/reverse-an-array/0
public class ReverseAnArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
//        int left = 0;
//        int right = a.length-1;
        reverse(0,a);
        for (int x : a){
            System.out.print(x+" ");
        }
    }

    public static void reverse(int i, int[] a){
        int n = a.length;
        if(i >= n/2) return;

        int temp = a[i];
        a[i] = a[n-i-1];
        a[n-i-1] = temp;

        reverse(i+1,a);
    }

//    public static void reverse(int[] a, int left, int right){
//        if(left >= right) return;
//
//        int temp = a[left];
//        a[left] = a[right];
//        a[right] = temp;
//
//        reverse(a,left+1, right-1);
//    }
}
