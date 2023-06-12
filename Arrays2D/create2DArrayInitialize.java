package Arrays2D;

import java.util.*;
public class create2DArrayInitialize {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of cols: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                // System.out.print("Enter the element in the cell "+(i+1)+","+(j+1)+" : ");
                arr[i][j]= sc.nextInt();
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
