package Array1D;


public class MaxMinValue {
    // to find maximum value in the array
    public static int MaxVal(int arr[]){
        int maximumValue = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(maximumValue < arr[i]){
                maximumValue=arr[i];
            }
        }
        return maximumValue;
    }

    // to find minimum value in the array
    public static int minVal(int arr[]){
        int minimumValue = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(minimumValue > arr[i]){
                minimumValue = arr[i];
            }
        }
        return minimumValue;
    }
    public static void main(String[] args) {
        int arr[]= {1111,22,23,25,225,412,110,999};
        // max value
        int maxV = MaxVal(arr);
        System.out.println();
        System.out.println("maximum value in the array is: "+maxV);

        // min value 
        int minV = minVal(arr);
        System.out.println("minimum value in the array is: "+minV);
    }
}
