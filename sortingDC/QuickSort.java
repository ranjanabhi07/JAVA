public class QuickSort {
    public static void quickSorting(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pvrt = sorting(arr,si,ei);
        quickSorting(arr, si, pvrt-1);
        quickSorting(arr, pvrt+1, ei);
    }

    public static int sorting(int arr[], int si, int ei){
        int i=si-1;
        int pvrt = arr[ei];
        
        for(int j=si; j<ei; j++){
            if(arr[j]<=arr[ei]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pvrt;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; 
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {-5,-2,4,86,2,55,22};
        quickSorting(arr, 0, arr.length-1);
        print(arr);
    }
}
