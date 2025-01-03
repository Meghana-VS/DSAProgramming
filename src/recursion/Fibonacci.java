package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n <= 1) return n;
        int last = fib(n-1);
        int secondLast = fib(n-2);
        return last + secondLast;

//        return fib(n-1) + fib(n-2);
    }
}
