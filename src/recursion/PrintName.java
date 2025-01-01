package recursion;

public class PrintName {
    public static void print_name(int i, int n){
        if(i > n)
            return;
        System.out.println("Joanna");
        print_name(i+1,n);
    }
    public static void main(String[] args) {
        int n = 5;
        print_name(1,n);
    }
}
