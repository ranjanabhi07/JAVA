package Exercise1;

public class SumOfOddNumbers {
    public static int sumOfOdd(){
        int sum =0;
        for(int i=1; i<=100; i++){
            if(i%2 !=0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter The number: ");
        // int n = sc.nextInt();
        int Sum =  sumOfOdd();
        System.out.println(Sum);
    }
}
