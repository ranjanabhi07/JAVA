// 1 1 1 1 1 
//  2 2 2 2 
//   3 3 3 
//    4 4 
//     5 


package AdvancePattern;

import java.util.*;

public class PrintInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/cols: ");
        int n = sc.nextInt();
        int num = 1;

        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
    }
}
