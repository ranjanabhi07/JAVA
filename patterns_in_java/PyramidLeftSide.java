// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         *

import java.util.*;

public class PyramidLeftSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of roes/cols: ");
        int n = sc.nextInt();

        // new line
        System.out.println();

        for(int i=n ; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
