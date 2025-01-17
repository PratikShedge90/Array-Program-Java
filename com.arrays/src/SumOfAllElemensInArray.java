public class SumOfAllElemensInArray {
    public static void main(String[] args) {

        int[] arr = {11,24,65,23,64};

        int sum=0;
        for (int i=0; i< arr.length; i++){
            if(i>=0){
                sum = sum + arr[i];
            }
        }
        System.out.println("The Total of An Array is : " + sum);
    }
}
