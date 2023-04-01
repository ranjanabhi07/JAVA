
import java.util.*;
public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Type which operation to be Performed  eg: add(1), sub(2), mul(3), divide(4), remainder(5) : ");
        int operation = sc.nextInt();

        switch(operation){
            case 1 : System.out.println("addition is: "+(a+b));
            break;
            case 2: System.out.println( "Substraction is"+(a-b));
            break;
            case 3: System.out.println("Multiplication is " +(a*b));
            break;
            case 4:  if(b==0){
                         System.out.println("Invalid Division");
                     } else {
                         System.out.println("Division is " +(a/b));
                     }
            break;
            case 5: if(b==0){
                         System.out.println("Invalid Division");
                     } else {
                        System.out.println("Remainder is "+(a%b));
                     }
            break;
            default : System.out.println("Invalid operator! please try again");
        }
    }
}
