package arrays.brute;

import java.util.ArrayList;
import java.util.List;

public class LeftRotateBy_K_Places {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};       // {3,4,5,6,7,1,2}
        int k = 2;
        leftRotate(a,k);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    static int[] leftRotate(int[] a, int k){
        int n = a.length;
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<k; i++){
            temp.add(a[i]);
        }
        //shift remaining elements to left
        for(int i=k; i<n; i++){
            a[i-k] = a[i];
        }
        //putting back first k elements to original array
        for(int i = n-k; i<n; i++){
            a[i] = temp.get(i-(n-k));
        }
        return a;
    }
}
