package arrays.brute;

public class SingleNumber {
    public static void main(String[] args) {
//        int[] a = {2,2,1};
//        int[] a = {4,1,2,1,2};
        int[] a = {1};
        System.out.println(findNum(a));
    }

    static int findNum(int[] a) {
        int n = a.length;

//        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(a[j] == a[i]){
                    count++;
                }
            }
//            maxi = Math.max(count, maxi);
            if(count == 1){
                return a[i];
            }
        }
        return -1;
    }
}
