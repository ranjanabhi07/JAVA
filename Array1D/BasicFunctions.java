package Array1D;
import java.util.*;

public class BasicFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        // input operation
        for(int i=0; i<array.length; i++){
            System.out.print("Enter the value of position: "+ i + " : ");
            array[i]=sc.nextInt();
        }
        System.out.println();

        // output operation
        for(int i=0; i<array.length; i++){

            System.out.println("At position: "+ i + " value is: "+ array[i]);
        }

        System.out.println();

        //updation 
        System.out.println("updated array is : ");
        array[2]=100;
        

        // output operation
        for(int i=0; i<array.length; i++){
            System.out.println("At position: "+ i + " value is: "+ array[i]);
        }


    }
}
