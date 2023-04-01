// * * * * * 
// *       * 
// *       * 
// *       *
// * * * * *

import java.util.*;

public class HollowRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of col: ");
        int m = sc.nextInt();

        // for gap
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*"+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}
