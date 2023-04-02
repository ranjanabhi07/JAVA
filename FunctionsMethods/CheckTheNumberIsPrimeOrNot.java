import java.util.*;

public class CheckTheNumberIsPrimeOrNot {

    public static String checkPrime(int n){

        if(n<1){
            return "Invalid Input";
        }
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }

        if(count == 2){
            return "The number is prime number";
        } else {
            return "The number is not prime";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is prime or not: ");
        int n = sc.nextInt();

        String check = checkPrime(n);

        System.out.println(check);
    }
}
