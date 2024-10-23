package arrays.brute;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
public class LargestNum {
    public static void main(String[] args) {
        int arr[] = {1, 8, 7, 56, 90};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
