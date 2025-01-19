import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6};

        leftrev(arr, 5,2);
        System.out.println(Arrays.toString(arr));
    }
    public  static void  leftrev(int[] arr, int n, int d){

        rev(arr, 0, d-1);
        rev(arr, d, n-1);
        rev(arr, 0, n-1);

    }
    public static void rev(int[] arr, int i , int j){

        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
