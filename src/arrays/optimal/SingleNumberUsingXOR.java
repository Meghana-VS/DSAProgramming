package arrays.optimal;

public class SingleNumberUsingXOR {
    public static void main(String[] args) {
//        int[] a = {1};
//        int[] a = {4,1,2,1,2};
        int[] a = {2,2,1};
        System.out.println(findNum(a));
    }
    static int findNum(int[] a) {
        int n = a.length;
        int XOR = 0;
        for(int i=0; i<n; i++){
            XOR = XOR ^ a[i];
        }
        return XOR;
    }
}
