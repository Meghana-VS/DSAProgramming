package arrays.brute;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
public class ReturnDuplicates {
    public static void main(String[] args) {
        int a[] = {2, 3, 1, 2, 3};
        List<Integer> result = duplicates(a);
        System.out.print(result+" ");
    }
    static List<Integer> duplicates(int a[]){
        int n=a.length;
        List<Integer> dupNumbers = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] == a[j]){
                    if(!dupNumbers.contains(a[i])){
                        dupNumbers.add(a[i]);
                    }
                }
            }
        }
        return dupNumbers;
    }
}
