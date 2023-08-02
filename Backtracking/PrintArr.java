public class PrintArr {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printArr(int arr[],int n, int i){
        if(i == arr.length){
            print(arr);
            return;
        }
        arr[i]=n;
        printArr(arr, n+1, i+1);
        System.out.print(arr[i]+" ");
        arr[i]= arr[i]-2;
    }


    public static void main(String args[]){
        int arr[] = new int[5];
        printArr(arr,1,0);
        System.out.println();
        print(arr);
    }
}
