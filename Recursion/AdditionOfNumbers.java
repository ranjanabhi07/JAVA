public class AdditionOfNumbers {
    public static int numbersAddition(int n){
        if(n==1){
            return 1;
        } 
        return n + numbersAddition(n-1);
    }

    public static void main(String[] args) {
        System.out.println(numbersAddition(5));
    }
}
