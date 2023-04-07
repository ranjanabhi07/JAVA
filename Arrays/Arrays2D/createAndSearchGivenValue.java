package Arrays2D;

import java.util.*;

public class createAndSearchGivenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no of cols: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.print("Enter the number to find in matrix: ");
        int num = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==num){
                    System.out.println(num +" found at index ("+i+", "+j+")");
                }
            } 
        }
    }
}

