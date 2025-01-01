package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {14,9,15,12,6,8,13};
        insertion_sort(a);
        for (int x : a){
            System.out.print(x+" ");
        }
    }
    public static void insertion_sort(int[] a){
        int n = a.length;
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j > 0 && a[j-1] > a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }
}
