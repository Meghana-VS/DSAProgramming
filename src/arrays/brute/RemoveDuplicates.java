package arrays.brute;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicates {

    //TC : nlogn+n
    //SC : o(n)
    public static void main(String[] args) {
//        int a[] = {1,1,2};
        int a[] = {0,0,1,1,1,2,2,3,3,4};
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }

        //Adding all unique elements back to array from set
        int k = set.size();
        int index = 0;
        for(int num : set){
            a[index] = num;
            index++;
        }
        System.out.println(k);
    }
}
