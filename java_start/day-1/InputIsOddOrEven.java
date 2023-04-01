
import java.util.*;
public class InputIsOddOrEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number +" is an odd number");
        }
        
    }

}
