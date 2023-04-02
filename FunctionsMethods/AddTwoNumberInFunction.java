import java.util.*;

public class AddTwoNumberInFunction {

    public static int SumOfTwoNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int sum = SumOfTwoNumbers(a, b);

        System.out.printf("The sum of %d and %d is %d",a,b,sum);
    }
}
