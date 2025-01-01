package recursion;

//https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1

import java.util.ArrayList;

//A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
//Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.
//
//Examples:
//Input: n = 6
//Output: 1 2 6
//Explanation: The first three factorial numbers are less than equal to n but the fourth factorial number 24 is greater than n. So we print only first three factorial numbers.
public class GFG_Factorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorialNumbers(n));
    }
    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        long fact = 1;
        long i = 1;

        while(fact <= n){
            result.add(fact);
            i++;
            fact *= i;
        }
        return result;
    }
}
