package arrays.brute;
//https://leetcode.com/problems/sort-colors/description/

//COUNTING SORT APPROACH
public class SortColors {
    public static void main(String[] args) {
//        int[] a = {2,0,2,1,1,0};
        int[] a = {2,0,1};
        sorting(a);
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static int[] sorting(int[] a){
        int count0 = 0, count1 = 0, count2 = 0;

        // Count each color
        for(int num : a){
            if(num == 0) count0++;
            else if(num == 1) count1++;
            else count2++;
        }

        // Fill the array with 0s, then 1s, then 2s
        int index = 0;
//        while(count0 > 0){
//            a[index] = 0;
//            count0--;
//            index++;
//        }
        while(count0-- > 0) a[index++] = 0;
        while(count1-- > 0) a[index++] = 1;
        while(count2-- > 0) a[index++] = 2;

        return a;
    }
}
