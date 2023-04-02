package Exercise1;
import java.util.*;

//using recursion this program finds gcd.

public class GreatestCommonDivisor {

    public static int gcd(int a , int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }

        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int gcd = gcd(a, b);

        System.out.printf("Greatest Common Divisor of %d and %d is: %d",a,b,gcd);
    }
}
