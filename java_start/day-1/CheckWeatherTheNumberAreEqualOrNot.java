
import java.util.*;
public class CheckWeatherTheNumberAreEqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("equal");
        } else if (a>b){
            System.out.println("a is greater then b");
        } else {
            System.out.println("b is greater then a");
        }
    }
}
