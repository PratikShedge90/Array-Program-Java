import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int[] a1 = new int[n1];
        for (int i=0; i<a1.length; i++){
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] a2 = new int[n2];
        for (int i=0; i<a2.length; i++){
            a2[i] = sc.nextInt();
        }

        int[] ans = new int[n1 > n2? n1:n2];

        int i = a1.length-1;
        int j = a2.length-1;
        int k = ans.length-1;

        int carry=0;
        while(k>=0){

            int sum =0;
            if(i>=0){
                sum = sum + a1[i];
            }

            if(j>=0){
                sum = sum + a2[j];
            }
            sum = sum + carry;

            carry = sum /10;
            sum = sum %10;
            ans[k] = sum;

            i--;
            j--;
            k--;
        }
        if(carry > 0){
            System.out.println(carry);
        }
        for(int val : ans){
            System.out.println(val);
        }



        /*
         public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int [] a = new int[n1];
        for (int i=0; i< a.length; i++){
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int [] b= new int[n2];
        for (int j=0; j< b.length; j++){
            b[j] = sc.nextInt();
        }

        int [] ans = new int[n1 > n2? n1: n2];

        int i = a.length-1;
        int j = b.length-1;
        int k = ans.length-1;

        int carry = 0;
        while(k>=0)
        {
            int sum = 0;
            if(i>=0)
            {
                sum = sum + a[i];
            }
            if(j>=0)
            {
                sum = sum + b[j];
            }
            sum = sum + carry;

            carry = sum / 10;
            sum = sum % 10;
            ans[k] = sum;

            i--;
            j--;
            k--;
        }
        if(carry>0)
        {
            System.out.println(carry);
        }
        for (int data : ans){
            System.out.println(data);
        }

         */
    }
}
