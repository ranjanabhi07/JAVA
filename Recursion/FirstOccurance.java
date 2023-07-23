import java.util.*;
public class FirstOccurance {
    public static int firstOccurance(int arr[], int value, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==value){
            return i;
        }

        return firstOccurance(arr, value, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arr: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the "+ i +"th element: ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int value = sc.nextInt();
        System.out.println("result: "+firstOccurance(arr,value, 0));
        
    }
}
