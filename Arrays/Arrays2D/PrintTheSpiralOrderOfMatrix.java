package Arrays2D;
import java.util.*;

public class PrintTheSpiralOrderOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

         int matrix[][] = new int[m][n];

         for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
         }

         int rowStart = 0;
         int rowEnd = m-1;
         int colStart = 0;
         int colEnd = n-1;

         while(rowStart <= rowEnd && colStart<=colEnd){
            for(int row=colStart; row<=colEnd; row++){
                System.out.print(matrix[rowStart][row] +" ");
            }
            rowStart++;

            for(int col=rowStart; col<=rowEnd; col++){
                System.out.print(matrix[col][colEnd]+" ");
            }
            colEnd--;
            
            for(int row=colEnd; row>=colStart; row--){
                System.out.print(matrix[rowEnd][row]+" ");
            }
            rowEnd--;

            for(int col=rowEnd; col>=rowStart; col--){
                System.out.print(matrix[col][colStart]+" ");
            }
            colStart++;
            System.out.println();
         }
    }
}
