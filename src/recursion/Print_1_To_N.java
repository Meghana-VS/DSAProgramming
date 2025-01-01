package recursion;

import java.util.Scanner;

//https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
public class Print_1_To_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
    }
    public static void printNos(int n) {
        if(n == 0)
            return;
        printNos(n - 1);
        System.out.print(n+" ");
    }
}
