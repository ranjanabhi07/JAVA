// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

package AdvancePattern;

import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/cols as per half: ");
        int n = sc.nextInt();

        // gap
        System.out.println();

        for(int i = 1; i<=n;i++){

            for(int j =1; j<=i; j++){
                System.out.print("*"+" ");
            }
            
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            
            for(int j=1 ; j<=i; j++){
                System.out.print("*"+" ");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}
