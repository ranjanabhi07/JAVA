import java.util.*;

public class PrintProductOfTwoNumbersThroughFunction {

    public static int printProductOfTwoNumber(int a , int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int product = printProductOfTwoNumber(a, b);

        System.out.printf("The Product of %d and %d is %d",a,b,product);
    }
}
