package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,3};
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr,low,high);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    public static void mergeSort(int a[], int low, int high){
        if(low >= high) return ;
        int mid = (low+high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a,low,mid,high);
    }
    public static void merge(int[] a, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid +1;

        //Comparing the elements of 2 subarrays and adding into temp array/list
        while(left <= mid && right <= high){
            if(a[left] <= a[right]){
                temp.add(a[left]);
                left++;
            }else {
                temp.add(a[right]);
                right++;
            }
        }
        //If either of the subarray is ran out of elements and then fill the temp[] with
        // remaining elements of the other subarray that still has elements left in it.
        while(left <= mid){
            temp.add(a[left]);
            left++;
        }
        while(right <= high){
            temp.add(a[right]);
            right++;
        }
        for(int i=low; i<= high; i++){
            a[i] = temp.get(i-low);
        }
    }
}
