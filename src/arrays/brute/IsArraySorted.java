package arrays.brute;

public class IsArraySorted {
    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 1, 4};
        int a[] = {1, 2, 2, 3, 3, 4};
        int n = 6;
        System.out.println(isSorted(a,n));
    }
     static boolean isSorted(int a[], int n){
        n = a.length;
        for(int i=1; i<n; i++){
            if(a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }
}
