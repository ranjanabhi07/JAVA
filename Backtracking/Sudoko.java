public class Sudoko {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //row
        for(int j=0; j<=8; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        //col
        for(int i=0; i<=8; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //grid
        int si = (row/3)*3;
        int sj = (col/3)*3;

        for(int i=si; i<=si+2;i++){
            for(int j=sj; j<=sj+2; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row==9){
            print(sudoku);
            return true;
        }

        //recursion
        int nextRow= row, nextCol= col+1;
        if(col+1==9){
            nextRow= row+1;
            nextCol =0;
        }

        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                } 

                sudoku[row][col]=0;
            }
        }
        return false;
    }

    public static void print(int sudoku[][]){
        System.out.println("--------------------SUDOKU---------------------");
        for(int i=0; i<sudoku.length;i++){
            for(int j=0; j<sudoku.length; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int Sudoku[][] = {{0, 3, 4, 0, 7, 0, 0, 1, 0},
        {6, 0, 0, 1, 9, 0, 3, 4, 8},
        {0, 9, 8, 0, 0, 2, 5, 6, 7},
        {8, 5, 0, 7, 6, 1, 0, 2, 3},
        {4, 2, 6, 8, 5, 3, 7, 9, 1},
        {0, 1, 0, 9, 2, 4, 8, 5, 0},
        {9, 0, 1, 0, 3, 0, 2, 8, 4},
        {0, 0, 7, 4, 0, 9, 6, 3, 5},
        {0, 0, 5, 2, 8, 6, 0, 7, 9} };

    

        System.out.println("Solution of this sudoku is possible:"+sudokuSolver(Sudoku, 0, 0));
    }
}
