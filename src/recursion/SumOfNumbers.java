package recursion;

//Print Sum of first N numbers
public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(findSum(5));
    }

//*************** PARAMETERISED WAY *******************

//    public static void findSum(int n, int sum){
//        if(n < 1){
//            System.out.print(sum);
//            return;
//        }
//        findSum(n-1, sum+n);
//    }

//    public static void findSum(int i, int n, int sum){
//        if(i > n){
//            System.out.print(sum);
//            return;
//        }
//        findSum(i+1,n, sum+i);
//    }


//****************** FUNCTIONAL WAY ********************

    public static int findSum(int n){
        if(n == 0) return 0;
        return n + findSum(n-1);
    }
}
