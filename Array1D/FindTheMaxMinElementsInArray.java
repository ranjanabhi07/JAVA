package Array1D;
import java.util.*;

public class FindTheMaxMinElementsInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the element at index :"+ (i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE; // 2^31-1 = 2147483647
        int max = Integer.MIN_VALUE; // -2^31 = -2147483648

        for(int i=0; i<size; i++){
            if (arr[i]< min){
                min=arr[i];
            }

            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("minimum value is: "+min);
        System.out.println("Maximum value is: "+max);


    }
}
