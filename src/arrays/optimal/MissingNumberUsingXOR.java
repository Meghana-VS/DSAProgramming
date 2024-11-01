package arrays.optimal;

//XOR of same numbers is 0. EX: 2^2 = 0
// XOR of 0 and any number is equal to that number itself. EX: 0^5 = 5
public class MissingNumberUsingXOR {
    //TC= o(n), SC=o(1)
    //XOR is slightly better than using natural number formula.coz if n=10power6, the approach
    //natural number formula might take extra memory
    public static void main(String[] args) {
//        int[] a = {3,0,1};
//        int[] a = {0,1};
        int[] a = {1};
        System.out.println(findNum(a));
    }
    static int findNum(int[] a){
        int XOR1 = 0, XOR2 = 0;

        int n = a.length;
        for(int i=0; i<n; i++){
            XOR2 = XOR2 ^ a[i];
            XOR1 = XOR1 ^ (i);
        }
        XOR1 = XOR1 ^ n;
        int number = XOR1 ^ XOR2;
        return number;
    }
}
