package recursion;

public class Factorial {
    public static void main(String[] args) {
        product(3,1);
    }
//    public static int product(int n){
//        if(n < 1) return 1;
//        return n * product(n-1);
//    }

    public static void product(int n, int prod){
        if(n == 0) {
            System.out.println(prod);
            return ;
        }
        product(n-1, prod*n);
    }
}
