package recursion;

import java.util.Scanner;

public class Print_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNums(1,n);
    }
    static void printNums(int i, int n){
        if(i > n) return;
        System.out.println(i);
        printNums(i+1,n);
    }
}
