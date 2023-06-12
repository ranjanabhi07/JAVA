// Our matrix is:
// 1  2  3  4
// 5  6  7  8
// 9  10  11  12
// 13  14  15  16

// Transpose of the matrix is:
// 1  5  9  13
// 2  6  10  14
// 3  7  11  15
// 4  8  12  16

package Arrays2D;
import java.util.*;

public class ForGivenMatrixPrintTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m =sc.nextInt();
        System.out.print("Enter number of cols: ");
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Enter matrix: ");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nOur matrix is: ");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose of the matrix is: ");

        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                System.out.print(matrix[i][j]+"  "); 
            }
            System.out.println();
        }
    }
}
