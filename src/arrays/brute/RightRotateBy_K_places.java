package arrays.brute;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/rotate-array/description/
public class RightRotateBy_K_places {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};   // {5,6,7,1,2,3,4}
        int k = 3;
        rightRotate(a,k);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    static int[] rightRotate(int a[], int k){
        int n = a.length;
        List<Integer> temp = new ArrayList<>();
        for(int i=n-k; i<n; i++){
            temp.add(a[i]);
        }
        for(int i=k; i>=0; i--){
            a[i+k] = a[i];
        }
        for(int i=0; i<k; i++){
            a[i] = temp.get(i);
        }
        return a;
    }
}
