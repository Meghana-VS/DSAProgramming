package arrays.brute;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroesToEnd {

    //TC = o(n) + o(x) + o(n-x) ==> o(2n)
    //SC = o(n) ==> for using an temp. list with non-zero elements(WORST CASE)
    public static void main(String[] args) {
//        int a[] = {0,1,0,3,12};
        int a[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
//        int a[] = {0};
        int n = a.length;
        moveZeroes(a,n);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    static void moveZeroes(int a[],int n){
        //take all non-zero numbers in a list
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                temp.add(a[i]);
            }
        }
        //add all non-zero numbers to the front of original array
        for(int i=0; i<temp.size(); i++){
            a[i] = temp.get(i);
        }
        int nz = temp.size();     //nz=numOfNonZeroNumbers
        //put zeroes at the end of the array
        for(int i = nz; i<n; i++){
            a[i] = 0;
        }

    }
}
