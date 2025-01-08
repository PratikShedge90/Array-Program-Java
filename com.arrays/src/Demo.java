public class Demo {
    public static void main(String[] args) {

        char[] arr = {'s','a','u','r','a','v'};

        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]=='a'){
                count++;
                break;
            }
        }
        System.out.println("Count" + count);
    }
}
