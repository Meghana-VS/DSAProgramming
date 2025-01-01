package arrays.optimal;
//https://leetcode.com/problems/sort-colors/description/
// YT REFERENCE = https://www.youtube.com/watch?v=6sMssUHgaBs

//Dutch National Flag problem
public class SortColors {
    //TC = o(n), SC = o(1)
    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};
        sorting(a);
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static int[] sorting(int[] a){
        int n = a.length;
        int start = 0;
        int mid = 0;
        int end = n-1;

        while(mid <= end){
            switch (a[mid]){
                case 0 :
                    swap(a,start,mid);
                    start++;
                    mid++;
                    break;
                case 1 :
                    mid++;
                    break;
                case 2 :
                    swap(a,mid,end);
                    end--;
                    break;
            }
        }
        return a;
    }
    static void swap(int[] a, int start, int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
