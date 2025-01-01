package sorting;

public class SelectionSort {

    public static void selection_sort(int[] a, int n){
        for(int i=0; i <= n-2; i++){
            int min = i;
            for(int j=i; j<=n-1; j++){
                if(a[j] < a[min]) min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] a = {29,10,14,37,13};
        int n = a.length;
        selection_sort(a,n);
        for (int x : a){
            System.out.print(x+" ");
        }
    }
}
