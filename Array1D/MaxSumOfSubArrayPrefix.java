package Array1D;

public class MaxSumOfSubArrayPrefix{

    public static void maxSum(int arr[]){

        int MaxSum =Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<prefix.length;i++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            currentSum =0;
            for(int j=i; j<arr.length; j++){
                int end =j;

                currentSum =  start==0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(MaxSum < currentSum ){
                    MaxSum = currentSum;
                }
            }
        }
        System.out.println(MaxSum);
    }
    public static void main(String[] args) {
        int arr[]={1, -2, 6, -1, 3};
        maxSum(arr);
    }
}