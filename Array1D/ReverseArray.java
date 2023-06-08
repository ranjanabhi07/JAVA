package Array1D;


public class ReverseArray {
    // to reverse the array 
    public static void reverseArray(int arr[]){
        int start = 0, end = arr.length-1;

        while(start<end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
        
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,12,22,23,25,258};
        print(arr);
        System.out.println();
        reverseArray(arr);
        print(arr);
    }
}
