import java.util.*;
public class UserInputNamesAndPrintNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        String[] arr = new String[size];
        

        for(int i=0; i<size; i++){
            System.out.print("Enter name at the index "+(i+1)+"  :");
            arr[i]= sc.next();
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
