public class PrintNumbersNTo1 {

    //Decreasing Order
    public static void printNumbersDecreasingOrder( int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        } 
        System.out.print(n+" ");
        printNumbersDecreasingOrder(n-1);
    }

    //Increasing Order
    public static void printNumbersIncreasingOrder(int n){
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printNumbersIncreasingOrder(n+1);
    }


    public static void main(String[] args) {
        printNumbersDecreasingOrder(10);
        System.out.println();
        // printNumbersIncreasingOrder(0);
    }
}