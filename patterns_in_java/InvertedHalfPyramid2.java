//         *
//       * *
//     * * *
//   * * * *
// * * * * *

import java.util.*;

public class InvertedHalfPyramid2 {  //inverted half pyramid (rotated by 180)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row's/col's: ");
        int n = sc.nextInt();

        // for gap
        System.out.println();

        for(int i =1; i<=n; i++){
            // for gap
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            // for *
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
            
        }
    }
}
