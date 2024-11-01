package arrays.optimal;

import java.util.*;

public class ReturnDuplicates {
    public static void main(String[] args) {
//        int a[] = {2, 3, 1, 2, 3};
        int a[] = {2};
        List<Integer> result = duplicates(a);
        System.out.print(result+" ");
    }
    static List<Integer> duplicates(int[] a){
        Map<Integer, Integer> countDuplicates = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for(int num : a){
            countDuplicates.put(num, countDuplicates.getOrDefault(num,0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : countDuplicates.entrySet()){
            if(entry.getValue() > 1){
                resultList.add(entry.getKey());
            }
        }
        Collections.sort(resultList);
        return resultList;
    }
}
