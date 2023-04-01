// * * * * * 
// * * * * 
// * * * 
// * * 
// *

import java.util.*;

public class InvertedHalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row's/col's: ");
        int n = sc.nextInt();

        // gap
        System.out.println();

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
