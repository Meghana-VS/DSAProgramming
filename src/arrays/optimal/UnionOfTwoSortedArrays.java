package arrays.optimal;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

//TWO POINTER APPROACH
public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
//        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
//        int arr2[] = {2,3,4,4,5,11,12};
        int[] arr1 = {1,2,3,4,5};      // {1,2,3,4,5}
        int[] arr2 = {2,3,4,4,5};
        List<Integer> uniArray = unionArray(arr1, arr2);
        for(int val : uniArray){
            System.out.print(val+" ");
        }
    }
    static List<Integer> unionArray(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;   // pointers

        List<Integer> union = new ArrayList<>();
        while(i<n1 && j<n2){
            if(a[i] <= b[j]){                                     //CASE 1 AND 2
                if(union.size() == 0 || union.get(union.size()-1) != a[i]){
                    union.add(a[i]);
                }
                i++;
            }else{                                                //CASE 3
                if(union.size() == 0 || union.get(union.size()-1) != b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1){                                 //If any elements are still there in array a[]
            if(union.get(union.size()-1) != a[i]){
                union.add(a[i]);
            }
            i++;
        }
        while (j<n2){                               ////If any elements are still there in array b[]
            if(union.get(union.size()-1) != b[j]){
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
}

//Time Complexity: O(m+n), Because at max i runs for n times and j runs for m times. When there are no common elements in arr1 and arr2 and all elements in arr1, arr2 are distinct.
//Space Complexity : O(m+n) {If Space of Union ArrayList is considered}
//O(1) {If Space of union ArrayList is not considered}
