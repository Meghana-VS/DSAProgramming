package recursion;

import java.util.Scanner;

public class Print_N_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);

//        printNumbers(n,1);
    }
    static void printNumbers(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        printNumbers(n-1);
    }

//    static void printNumbers(int n, int i){
//        if(n < i)
//            return;
//        System.out.println(n);
//        printNumbers(n-1,i);
//    }
}
