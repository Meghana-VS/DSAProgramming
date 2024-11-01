package arrays.brute;

import java.util.HashSet;
import java.util.Set;

//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
public class UnionOfTwoSortedArrays {
    //TC = o(n1 logn) + o(n2 logn) + o(n1+n2)
    //SC = o(n1+n2)
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};      // {1,2,3,4,5}
//        int[] b = {2,3,4,4,5};
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {2,3,4,4,5,11,12};
        union(arr1,arr2);
    }
    static void union(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            set.add(b[i]);
        }
        int[] union = new int[set.size()];
        int i = 0;
        for(int j : set){
            union[i++] = j;
        }
        for(int num : union){
            System.out.print(num+" ");
        }
    }
}
