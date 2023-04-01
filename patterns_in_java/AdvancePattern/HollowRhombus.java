//         * * * * *
//       *       *
//     *       *
//   *       *
// * * * * *

package AdvancePattern;

import java.util.*;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nimber of roes/cols: ");
        int n = sc.nextInt();

        // gap

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
