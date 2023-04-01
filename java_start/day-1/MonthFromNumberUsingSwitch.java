
import java.util.*;

public class MonthFromNumberUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for month: ");
        int month = sc.nextInt();

        switch(month){
            case 1: System.out.println("first month is: "+"January");
            break;
            case 2: System.out.println("Second month is: "+"February");
            break;
            case 3: System.out.println("Third month is: "+"March");
            break;
            case 4: System.out.println("Fourth month is: "+"April");
            break;
            case 5: System.out.println("fifth month is: "+"May");
            break;
            case 6: System.out.println("Sixth month is: "+"June");
            break;
            case 7: System.out.println("Seventh month is: "+"July");
            break;
            case 8: System.out.println("Eighth month is: "+"August");
            break;
            case 9: System.out.println("Ninth month is: "+"September");
            break;
            case 10: System.out.println("Tenth month is: "+"October");
            break;
            case 11: System.out.println("Eleventh month is:  "+"November");
            break;
            case 12: System.out.println("Twelfth month is: "+"December");
            break;
            default : System.out.println("Invalid Input");
        }
    }
}
