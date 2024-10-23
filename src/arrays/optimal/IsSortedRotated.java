package arrays.optimal;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class IsSortedRotated {
    public static void main(String[] args) {
//        int a[] = {3,4,5,1,2};
//        int a[] = {2,1,3,4};
        int a[] = {1,2,3};
        System.out.println(isArraySortedRotated(a));
    }
    static boolean isArraySortedRotated(int a[]){
        int count = 0;
        if(a[0] < a[a.length-1]){
            count++;
        }
        for(int i=0; i<a.length-1; i++){
            if(a[i] > a[i+1]){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}
