package Exercise1;
import java.util.*;

public class CheckThatPersonIsEligibleToVoteOrNot {

    public static String checkEligibility(int age){
        if(age<0){
            return "Invalid age, please enter the valid age!";
        }
        if(age>=18){
            return "The person is ELIGIBLE to vote!";
        } else{
            return "NOT ELIGIBLE!";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Age: ");
        int age = sc.nextInt();

        String eligibility = checkEligibility(age);

        System.out.println(eligibility);
    }
}
