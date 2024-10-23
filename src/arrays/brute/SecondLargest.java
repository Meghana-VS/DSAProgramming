package arrays.brute;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
public class SecondLargest {

  //TC - o(2n)
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 7, 7, 5};
        int n = a.length;
        int largest = a[0];     //Integer.MIN_VALUE
        int sLargest = a[0];    // Integer.MIN_VALUE

        for(int i=0; i<n; i++){
            largest = Math.max(largest, a[i]);
        }
        for (int i=0; i<n; i++){
            if(a[i] > sLargest && a[i] != largest){
                sLargest = a[i];
            }
        }
        System.out.println(sLargest);
    }

    //TC - n(logn) + n
//    public static void main(String[] args) {
////        int a[] = {1, 2, 4, 7, 7, 5};
//        int a[] = {10,10};
//        Arrays.sort(a);
//        int n = a.length;
//        int sLargest = -1;
//        for(int i=n-2; i>=0; i--){
//            if(a[i] != a[n-1]){
//                sLargest = a[i];
//                break;
//            }
//        }
//        System.out.println(sLargest);
//    }
}
