package Exercise1;
import java.util.*;

public class OneNumPowerToSecondNum {
    public static void PowerXToTheY(int x, int n){
        double pow = Math.pow(x,n);

        System.out.println("The value of "+ x +" raise to the power of "+ n +" is: "+pow);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = sc.nextInt();
        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        PowerXToTheY(x, n);
    }
}
