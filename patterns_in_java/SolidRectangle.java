// * * * * * 
// * * * * * 
// * * * * * 
// * * * * *
// * * * * *

import java.util.*;

public class SolidRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of col: ");
        int m = sc.nextInt();

        // for gap
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++)
            System.out.print("*"+" ");
            System.out.println();
        }
    }
}
