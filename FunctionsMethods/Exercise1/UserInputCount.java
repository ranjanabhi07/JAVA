package Exercise1;
import java.util.*;

public class UserInputCount {
    public static void UserInputsCount(){
        Scanner sc = new Scanner(System.in);
        int PositiveCount = 0;
        int NegativeCount = 0;
        int ZerosCount = 0;
        String enter;
        do{
            System.out.print("Enter any number: ");
            int n = sc.nextInt();

            if(n>0){
                PositiveCount++;
            } else if(n==0){
                ZerosCount++;
            } else {
                NegativeCount++;
            }

            System.out.print("do you want to continue (y/n): ");
            enter = sc.next();
        }while(enter.startsWith("y"));

        System.out.println();

        System.out.printf("Total count of positive number's are: %d %n",PositiveCount);
        System.out.printf("Total count  of negative number's are: %d %n",NegativeCount);
        System.out.printf("Total count of zero's are: %d",ZerosCount);
    }

    public static void main(String[] args) {
        UserInputsCount();
    }
}
