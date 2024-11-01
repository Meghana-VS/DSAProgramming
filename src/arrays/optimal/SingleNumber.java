package arrays.optimal;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/single-number/description/
public class SingleNumber {
    public static void main(String[] args) {
//        int[] a = {2,2,1};
//        int[] a = {4,1,2,1,2};
        int[] a = {1};
        System.out.println(findNum(a));
    }
    static int findNum(int[] a){
        int n = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
