// *                 *
// * *             * *
// *   *         *   *
// *     *     *     *
// *       * *       *
// *       * *       *
// *     *     *     *
// *   *         *   *
// * *             * *
// *                 *

package AdvancePattern;

import java.util.*;

public class HollowButterFly {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/cols: ");
        int n = sc.nextInt();

        // gap
        System.out.println();

        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("*"+" ");
                } else{
                    System.out.print("  ");
                }
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i;j++){
                if(j==1 || i==j){
                    System.out.print("*"+ " ");
                } else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        for(int i =n; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("*"+" ");
                } else{
                    System.out.print("  ");
                }
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i;j++){
                if(j==1 || i==j){
                    System.out.print("*"+ " ");
                } else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
