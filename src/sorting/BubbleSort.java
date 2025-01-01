package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {13,46,24,52,20,9};
        bubble_sort(a);
        for (int x : a){
            System.out.print(x+" ");
        }
    }
    public static void bubble_sort(int[] a){
        int n = a.length;
        for(int i = n-1; i >= 1; i--){
            int didSwap = 0;
            for(int j = 0; j < i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0)
                break;
        }
    }
}
