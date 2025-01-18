public class FindHighestElement {
    public static void main(String[] args) {
        int[] arr = {3,6,2,9,56,24,64,38,96,99};

        int max = arr[0];
        for (int i=1; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The Highest Element in Array -->" + max);
    }
}
