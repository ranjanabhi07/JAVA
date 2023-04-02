package Exercise1;
import java.util.*;

public class ReturnGreaterOfTwoNumber {
    public static int GreaterOfTwo(int a, int b){
        if(a>b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int a = sc.nextInt();
        System.out.print("Enter number two: ");
        int b = sc.nextInt();

        int  greaternumber = GreaterOfTwo(a, b);
        
        System.out.printf("The greater number from %d and %d is: %d",a,b,greaternumber);
    }
}
