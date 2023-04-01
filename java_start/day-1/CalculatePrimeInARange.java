import java.util.*;

public class CalculatePrimeInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count, total=0; 
        // total no of prime in the given range & all prime numbers in the given range
        
        for(int i=1; i<=n; i++){
            count = 0;
            for(int j=1; j<=i; j++)
                if(i%j==0)
                count++; 
                if(count==2){
                    System.out.print(i+ " ");
                    total++;
                }
        }

        System.out.println("\nTotal number of prime numbers are: "+ total);
    }
}
