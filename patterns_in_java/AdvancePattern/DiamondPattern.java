//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *

package AdvancePattern;

import java.util.*;

public class DiamondPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/cols: ");
        int n = sc.nextInt();

        // gap
        System.out.println();

        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            int NumOfStarsInARow = (2*i)-1;
            for(int j=1; j<=NumOfStarsInARow; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            int NumOfStarsInARow = (2*i)-1;
            for(int j=1; j<=NumOfStarsInARow; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
