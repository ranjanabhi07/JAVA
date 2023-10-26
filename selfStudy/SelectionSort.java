public class SelectionSort {

    public static void SS(int arr[]){
        for(int i=0; i<arr.length; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {5,7,1,3,2,6,4};
        SS(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
