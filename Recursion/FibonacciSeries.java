public class FibonacciSeries {

    public static int findFibonacci(int n){
        if(n==0 || n==1){
            return n;
        } 
        return findFibonacci(n-1)+findFibonacci(n-2);
        
    }

    public static void printFibonacci(int n){
        for(int i=0;i<=n;i++){
            System.out.print(findFibonacci(i)+" ");
        }
    }

    public static void main(String[] args) {
        printFibonacci(5);
    }
}