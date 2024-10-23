package arrays.optimal;

//https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array

public class LargestNum {
    public static void main(String[] args) {
//        int arr[] = {1, 8, 7, 56, 90};
//        int arr[] = {5, 5, 5, 5};
        int arr[] = {10};

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max=arr[i];
        }
        System.out.println(max);
    }
}
