import java.util.Scanner;

public class FirstArrayProgram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] arr = new int[input];

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for( int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}