package arrays.optimal;

public class SecondLargest {

    //TC - o(n)
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 7, 7, 5};
        int large = a[0];
        int sLarge = -1;
        int n = a.length;

        for(int i=0; i<n; i++){
            if(a[i] > large ){
                sLarge = large;
                large = a[i];
            } else if(a[i] > sLarge && a[i] != large) {
                sLarge = a[i];
            }
        }
        System.out.println(sLarge);
    }
}
