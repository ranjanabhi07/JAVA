import java.util.*;

public class FindFactorialOfANumber {
    

    public static int findFactorial(int n){

        // base case
        if(n<1){
            return -1;
        }
        int product =1;
        for(int i=n; i>=1; i--){
            product = product *i;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial: ");
        int n = sc.nextInt();

        int product = findFactorial(n);

        if(n<1){
            System.out.println("Invalid number!");
        } else{
            System.out.printf("The Factorial of: %d, is: %d",n,product);
        }
       
    }
}
