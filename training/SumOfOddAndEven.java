public class SumOfOddAndEven {

    public static void evenAndOddSum(int arr[]){
    int sumOfEven = 0;
    int sumOfOdd = 0;
    int bitMask = 1;

    for(int i=0; i<arr.length; i++){
        if((arr[i] & bitMask) == 1){
            sumOfOdd += arr[i];
        } else {
            sumOfEven += arr[i];
        }
    }
    
    System.out.println("Sum of odd :"+sumOfOdd+" & Sum of even :"+sumOfEven);
}

    public static void main(String[] args) {
        int arr[] = {2,4,6,7,-1,3,6};
        evenAndOddSum(arr);
    }
}
