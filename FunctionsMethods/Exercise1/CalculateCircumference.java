package Exercise1;
import java.util.*;

public class CalculateCircumference {
    public static double CircumferenceOfCircle(int radius){
        double circumference = 2*Math.PI*radius;

        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();

        double circumference = CircumferenceOfCircle(radius);

        System.out.println(Math.PI); //3.141592653589793

        System.out.println("The Circumference of the circle is: "+circumference);
        
    }
}

// https://www.programiz.com/java-programming/library/math = all math.__( ) functions;