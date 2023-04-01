
import java.util.*;

public class AreaAndPerimeterOfCircle {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextDouble();

    double pi = 3.14;

    double areaOfCircle =  pi * (radius * radius);

    double perimeterOfCircle = 2*pi*radius;

    System.out.println("Area of Circle is: "+areaOfCircle+", Perimeter of Circle is: "+perimeterOfCircle);
   }

}
