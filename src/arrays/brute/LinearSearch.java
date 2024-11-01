package arrays.brute;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int target = 4;
        System.out.println(search(a,target));
    }
    static int search(int[] a, int target){
        for(int i=0; i<a.length; i++){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }
}
