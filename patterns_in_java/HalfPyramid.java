// * 
// * * 
// * * * 
// * * * * 
// * * * * *

import java.util.*;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row's/col's: ");
        int n = sc.nextInt();

        // for gap
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
