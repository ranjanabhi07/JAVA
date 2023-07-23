public class FactorialOfANumber {
    public static int printFact(int n){
        if(n==0){
         return 1;
        }
         return n*=printFact(n-1);
    }

    public static void main(String[] args) {
        
        System.out.println(printFact(4));
    }
}
