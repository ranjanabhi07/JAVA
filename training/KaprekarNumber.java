public class KaprekarNumber {
    public static boolean kaprekarNumber(int number){
        int squt = number*number;
        int count = 0, temp = squt;
        boolean Kaprekar = false;

        // finded no of digits
        while(temp>0){
            count++;
            temp /= 10;
        }

        System.out.println(number+ " square is: "+squt);
        System.out.println("no of digits are: "+count);

        for(int i=1; i<count; i++){
            int divisor = (int)Math.pow(10, i);
            int Remainder = squt%divisor;
            int Quotient = squt/divisor;
            int sum = Remainder + Quotient;

            if(sum == number){
                System.out.println("Quotient:"+ squt/divisor+", Remainder: "+Remainder);
                Kaprekar = true;
                break;
            }
        }

        return Kaprekar;
    }
    public static void main(String[] args) {
        int arr[] = {100,10,9,7,55,99};
        int number;
        for(int i =0; i<arr.length; i++){
            number = arr[i];
            System.out.println("the "+number+" is KaorekarNumber: "+kaprekarNumber(number));

            System.out.println();
        }  
    }
}
