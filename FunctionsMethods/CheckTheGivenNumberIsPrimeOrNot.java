import java.util.*;

public class CheckTheGivenNumberIsPrimeOrNot {
    public static String CheckTheNumberIsEvenOrNot(int n){
        if(n%2==0){
            return "It is an Even number";
        } else {
            return "It is Not an Even number";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number to check weather the given number is Even number or not: ");
        int n = sc.nextInt();

        String check = CheckTheNumberIsEvenOrNot(n);

        System.out.println(check);
    }
}
