import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {

        int[] a = {3,4,5};
        int[] b = {7,5,4};
        /*
        System.out.println("Enter the 1st Array Length:");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[]a = new int[n1];
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the 2nd Array Length:");
        int n2 = sc.nextInt();
        int[]b = new int[n2];
        for (int j=0; j<b.length; j++){
            b[j] = sc.nextInt();
        }
*/
        int[] ans = new int[b.length];

        int carry=0;
        int i = a.length-1;
        int j = b.length-1;
        int k = ans.length-1;

        while(k>=0){
            int d =0;

            if(b[j] + carry >= a[i]) {
                d = b[j] + carry - a[i];
                carry=0;
            }
            else{
                d = b[j] + carry + 10 - a[i];
                carry = -1;
            }

            ans[k]= d;

            i--;
            j--;
            k--;
        }
        for (int data : ans){
            System.out.println(data);
        }
    }
}
