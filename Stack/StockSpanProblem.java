import java.util.*;
public class StockSpanProblem {
    public static void stockSpan(int arr[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]= 1;
        s.push(0);

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            while(!s.isEmpty() && current > arr[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,85,100};
        int span[] = new int[arr.length];

        stockSpan(arr,span);

        for(int i=0 ; i<span.length; i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
}
