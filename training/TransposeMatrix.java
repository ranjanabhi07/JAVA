public class TransposeMatrix {
    
    // transpose of the matrix
    public static void transposeRealMatrix(int matrix[][]){
        int row = matrix.length, col = matrix[0].length;
        int temp;
        for(int i=0; i<row; i++){
            for(int j=0; j<col ; j++){
                if(i<j && row == col){
                temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
                }
            }
        }
    }

    // transpose in new array
    public static void transposeInDummyMatrix(int matrix[][]){
        int row = matrix.length, col = matrix[0].length;
        int transpose[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    // print function 
    public static void printMatrix(int matrix[][]){
        int row = matrix.length, col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printMatrix(matrix);
        System.out.println();
        transposeInDummyMatrix(matrix);
        System.out.println();
        transposeRealMatrix(matrix);
        System.out.println();
        transposeInDummyMatrix(matrix);
    }
}
