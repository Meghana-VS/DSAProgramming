package arrays.optimal;

//TWO POINTER APPROACH
public class RemoveDuplicates {
    public static void main(String[] args) {
//        int a[] = {0,0,1,1,1,2,2,3,3,4};
        int a[] = {1,1,2};

        int n = a.length;
        int i = 0;
        for(int j=1; j<n; j++){
            if(a[j] != a[i]){
                a[i+1] = a[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
