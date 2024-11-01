package arrays.optimal;

//TWO POINTERS APPROACH
public class MoveZeroesToEnd {
    //TC = o(n)
    //SC = o(1)
    public static void main(String[] args) {
//        int a[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
//        int a[] = {0};
        int a[] = {5,6};
        int n = a.length;
        moveZeroes(a,n);
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static int[] moveZeroes(int[] a, int n) {
        int j = -1;
        //find the first zero
        for(int i=0; i<n; i++){
            if(a[i] == 0){
                j = i;
                break;
            }
        }
        //no zeroes
        if(j == -1) return a;

        //move the pointers i and j, and move accordingly
        for(int i = j+1; i<n; i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
}


