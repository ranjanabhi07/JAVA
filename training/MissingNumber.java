import java.util.*;
public class MissingNumber {
    public static int missingNumber(int arr[]){
        int n = arr.length+1;
        int ArrSum = 0;
        int OriginalSum = 0;
        
        for(int i=0; i<arr.length; i++){
            ArrSum += arr[i];
        }

        OriginalSum = (n*(n+1))/2; 

        int missingNumberIs = OriginalSum - ArrSum;
        return missingNumberIs;
        
    }

    public static void MissingAllNumbers(int arr[]){
        int j=0;
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(maximum < arr[i]){
                maximum = arr[i];
            }
            while(j <= maximum){
            if(arr[i] != j){
                System.out.println(j);
                j++;
            } else {
                j++;
            }
        }
        }
    }

    public static void PrintMissing(int arr[]){
        Arrays.sort(arr);
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("enter the element at position: "+(i+1)+" :");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        // int arr[] = {1,2,3,4,6,5,7,9};
        // System.out.println("missing number in the array is: "+missingNumber(arr));
        MissingAllNumbers(arr);
    }
}
