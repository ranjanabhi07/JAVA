package Array1D;
import java.util.*;

public class CheckTheGivenArrayIsSortedInAssendingOrderOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the elements at the index "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i=0; i<arr.length-1; i++){     // i<size    then for i+1  it will give array index out of bounce 
            if(arr[i]>arr[i+1]){   
                isSorted = false;
            }
        }

        if(isSorted){
            System.out.println("the array is sorted");
        } else {
            System.out.println("array is not sorted!!");
        }

    }
}
