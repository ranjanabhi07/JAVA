import java.util.*;

public class FindMaximumArea {

    public static int maxArea(int arr[]){
        int maxAr = Integer.MIN_VALUE;
        int asl[] = new int[arr.length];
        int asr[] = new int[arr.length]; 

        //left smaller value
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1 ; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                asr[i] = arr.length;
            } else {
                asr[i] = s.peek();
            }
            s.push(i);
        }

        // right smaller value
        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                asl[i] = -1;
            } else {
                asl[i] = s.peek();
            }
            s.push(i);
        }
        // calculate area

        for(int i=0; i<arr.length; i++){
            int length = arr[i];
            int breadth = asr[i] - asl[i] - 1;
            int currmax = length * breadth;

            maxAr = Math.max(currmax,maxAr);
        }
        return maxAr;
    }

    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        int arr2[] = {2,4};

        System.out.println(maxArea(arr));
        System.out.println(maxArea(arr2));
    }
}
