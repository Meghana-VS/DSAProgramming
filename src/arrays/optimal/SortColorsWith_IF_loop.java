package arrays.optimal;

//Dutch National Flag problem
public class SortColorsWith_IF_loop {
    //TC = o(n), SC = o(1)
    public static void main(String[] args) {
//        int[] a = {2,0,2,1,1,0};
        int[] a = {2,0,1};
        sorting(a);
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static int[] sorting(int[] a){
        int n = a.length;
        int start = 0;
        int mid = 0;
        int end = n-1;

        while(mid <= end){
            if(a[mid] == 0) {
                swap(a, start, mid);
                start++;
                mid++;
            }
            else if(a[mid] == 1) {
                mid++;
            }
            else{
                swap(a,mid,end);
                end--;
            }
        }
        return a;
    }
    static void swap(int[] a, int start, int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
