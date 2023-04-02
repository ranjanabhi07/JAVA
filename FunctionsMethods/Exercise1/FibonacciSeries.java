package Exercise1;
import java.util.*;


public class FibonacciSeries {

    public static void PrintFibonacci(int n){
        int a = 0;
        int b = 1;
        int c;

        if(n==1){
            System.out.println("0");
        } else if(n==2){
            System.out.println("0 "+"1");
        } else{
            System.out.print("0 "+"1 ");
            for (int i=1; i<=n; i++){
                c = a+b;
                System.out.print(c+" ");
                int temp = a;
                a = b;
                b = c;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        PrintFibonacci(n);
    }
}
