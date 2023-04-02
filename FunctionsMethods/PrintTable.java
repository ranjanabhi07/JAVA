import java.util.*;

public class PrintTable {
    public static void printTable(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n +" * "+ i +" = "+ n * i);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get it's Table: ");
        int n = sc.nextInt();

        printTable(n);
    }
}
