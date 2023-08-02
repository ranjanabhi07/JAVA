public class NQueens {
    public static boolean correctPos(char table[][], int row, int col){
        // top
        for(int i=row; i>=0; i--){
            if(table[i][col]=='Q'){
                return false;
            }
        }
        //up left diagonal
        for(int i=row, j=col; i>=0 && j>=0; i--,j--){
            if(table[i][j]=='Q'){
                return false;
            }
        }
        //up right diagonal
        for(int i=row, j=col; i>=0 && j<table.length; i--,j++){
            if(table[i][j]=='Q'){
                return false;
            }
        }
        
        return true;
    }

    public static void nQueen(char table[][], int i){
        if(i==table.length){
            count++;
            print(table);
            return;
        }
        for(int col=0; col<table.length; col++){
            if(correctPos(table, i, col)){
                table[i][col] = 'Q';
                nQueen(table, i+1);
                table[i][col] = 'x';
            }
        }
    }

    public static void print(char table[][]){
        System.out.println("------------------table-----------------------");
        for(int i=0; i<table.length; i++){
            for(int j=0; j<table.length; j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int count =0;
    public static void main(String args[]){
        int n=5;
        char table[][] = new char[n][n];

        for(int i=0; i<table.length; i++){
            for(int j=0; j<table.length; j++){
                table[i][j]= 'x';
            }
        }
        
        nQueen(table, 0);
        System.out.printf("The total number of possible out come is: %d",count);
    }
}