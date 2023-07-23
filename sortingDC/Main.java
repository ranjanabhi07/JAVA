import java.util.*;
public class Main {
    //merge sort main function
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        sorting(arr, si, mid, ei);
    }
    //merge sort helper function
    public static void sorting(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            } else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    //print function
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //quick sort function
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pvrt = pivort(arr, si, ei);
        quickSort(arr, si, pvrt-1);
        quickSort(arr, pvrt+1, ei); 
    }

    //quick sort helper fnction
    public static int pivort(int arr[], int si, int ei){
        int j = si-1;
        int pvrt = arr[ei];

        for(int i=si; i<ei; i++){
            if(arr[i]<=pvrt){
                j++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }  
        }
            j++;
            int temp = pvrt;
            arr[ei] = arr[j];
            arr[j] = temp;
            return j;
    } 

    public static void main(String[] args) {
        //create and assigning the value in the arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the arr: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.printf("Enter the element at index: %s: ",i);
            arr[i]=sc.nextInt();
        }

        //calling the merge sort and print function to show the result :)

        print(arr);
        System.out.println();
        System.out.println("merge sort: ");
        mergeSort(arr, 0, arr.length-1);
        print(arr);

        System.out.println();

        //calling the quick sort and print function to show the result :)

        print(arr);
        System.out.println();
        System.out.println("quick sort: ");
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
