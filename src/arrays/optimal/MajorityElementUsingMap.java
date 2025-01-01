package arrays.optimal;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementUsingMap {
    //TC = o(nlogn) + o(n)
    //SC = o(n)
    public static void main(String[] args) {
        int[] a = {3,2,3};
//        int[] a = {2,2,1,1,1,2,2};
        System.out.println(findElement(a));
    }
    static int findElement(int[] a){
        int n = a.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(a[i],map.getOrDefault(a[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
