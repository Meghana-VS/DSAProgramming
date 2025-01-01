package recursion;

//https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
//Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
//Input: n = 5
//Output: 225
//Explanation: 13 + 23 + 33 + 43 + 53 = 225
public class GFG_sumOfFirst_N_numbers {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }

    public static int sumOfSeries(int n) {
        if(n == 0) return 0;
        return (int)(Math.pow(n,3) + sumOfSeries(n-1));
    }
}
