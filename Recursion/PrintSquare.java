public class PrintSquare {
    public static int powerOfANumber(int n, int m){
        if(n==1 || m==0){
            return 1;
        }
        return n*powerOfANumber(n, m-1);
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        System.out.println(powerOfANumber(n, m));
    }
}