import java.util.*;

public class PrintNext{
    public static void printArray(int arr[]){
        int newArr[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }

        Arrays.sort(newArr);
        

        for(int i=0; i<arr.length-1; i++){
            int current = arr[i];
            for(int j=0; j<arr.length; j++){
                if(current == newArr[j] ){
                    System.out.println(newArr[j+1]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);
    }
    
    
}
