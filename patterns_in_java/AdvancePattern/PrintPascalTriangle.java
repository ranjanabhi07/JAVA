//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 

package AdvancePattern;

import java.util.*;

public class PrintPascalTriangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of rows/cols: ");
         int n = sc.nextInt();

        //  gap
        System.out.println();
 
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int num=1;
            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
