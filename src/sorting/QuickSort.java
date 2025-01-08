package sorting;

//TC = o(Nlog2N)
//SC = o(1)
public class QuickSort {
    public static void main(String[] args) {
        int a[] = {4,6,2,5,7,9,1,3};
        quickSort(a, 0, a.length-1);

        for(int x : a){
            System.out.print(x+" ");
        }
    }
    public static void quickSort(int[] a, int low, int high){
        if(low < high){
            int partitionIndex = partition(a,low,high);
            quickSort(a, low, partitionIndex-1);
            quickSort(a, partitionIndex+1, high);
        }
    }
    public static int partition(int[] a, int low, int high){
        int pivot = a[low];
        int i = low;
        int j = high;
        while (i < j){
            while (a[i] <= pivot && i <= high-1){
                i++;
            }
            while (a[j] > pivot && j >= low + 1){              // {4,6,2,5,7,9,1,3}
                j--;
            }
            if(i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
    }
}
