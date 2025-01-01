package recursion;

public class PrintNumbers {
    static int count = 0;
    public static void func(){
        if(count == 3) return;
        System.out.println(count);
        count++;
        func();
    }
    public static void main(String[] args) {
        func();
    }

}
