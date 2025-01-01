package arrays.optimal;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMap {
    //TC=0(n), SC=o(n)
    public static void main(String[] args) {
//        int a[] = {3,2,4};
//        int target = 6;
        int[] a = {2,7,11,15};
        int target = 9;
        int[] result = findPair(a,target);
        System.out.print(result[0]+","+result[1]);
    }
    static int[] findPair(int[] a, int target) {
        int n = a.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int moreNeeded = target - a[i];
            if(map.containsKey(moreNeeded)) {
                return new int[]{map.get(moreNeeded), i};
            }
            map.put(a[i],i);
        }
        return new int[]{};
    }
}
