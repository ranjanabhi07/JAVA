package Array1D;
// time complexity = 0(n^3)

public class PrintSubArrayBrute {
    // function to calculate subArray this is brute force approach 
    public static void subArray(int arr[]){
         // sum of sub arrays
         int sum = 0;
         // to get total no of pairs
         int total = 0;
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length;i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end= j;
                sum =0;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+"  ");
                    sum = sum + arr[k]; 
                }
                System.out.print(", sum: "+sum);
                
                // check for minimum val of sum of an subarray
                if(min > sum){
                    min = sum;
                }

                // checking for maximum val of sum of an subarray
                if(max < sum){
                    max = sum;
                }
                System.out.println();
                total++; 
            }
            System.out.println();
            
            
        }

        System.out.println("min sum of sub array is : "+ min);
        System.out.println("max sum of sub array is : "+ max);

        System.out.println("total: "+ total);
        
    }
    // main
    public static void main(String args[]){
        int arr[]= {1, -2,6,-1,3};
        subArray(arr);
    }
}
