package arrays.optimal;

public class RightRotateByOnePlace {
    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5};
        int a[] = {1,2,3,4,5,6,7};
        rightRotate(a);
    }

    static int[] rightRotate(int a[]){
        int n = a.length;
        int temp = a[n-1];
        for(int i=n-2; i>=0; i--){
            a[i+1] = a[i];
        }
        a[0] = temp;
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        return a;
    }
}
