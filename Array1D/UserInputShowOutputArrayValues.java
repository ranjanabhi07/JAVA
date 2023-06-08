package Array1D;
import java.util.*;

public class UserInputShowOutputArrayValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        int a;

        for(int i=0; i<size; i++){
            System.out.print("Enter element at index "+ (i+1) +"  : ");
            arr[i]=a=sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
