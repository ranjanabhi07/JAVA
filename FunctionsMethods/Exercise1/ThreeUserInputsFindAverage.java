package Exercise1;
import java.util.*;

public class ThreeUserInputsFindAverage {

    public static void average(int a , int b ,int c){

        // average = sum of number / count of number 

        int avg = (a+b+c)/3;
        System.out.println("The Average is: "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third number: ");
        int c = sc.nextInt();

        average(a, b, c);

    }
}
