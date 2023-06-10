public class BasicSorting {
    // bubble sort
    public static void bubbleShort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // selection sort
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort 
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr ){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }

    // count Sort
    public static void countSort(int arr[]){
        // find max number in the given array
        int MaxNum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            MaxNum = Math.max(MaxNum, arr[i]);
        }
        // incerase the count and put in the new array
        int CountArr[] = new int[MaxNum+1];
        for(int i=0; i<arr.length; i++){
            CountArr[arr[i]]++;
        }
        // print the new array
        System.out.print("the Count array is :");
        for(int i=0; i<CountArr.length; i++){
            System.out.print(CountArr[i]+" ");
        }

        System.out.println();

        // sorting 
        int j=0;
        for(int i=0; i<CountArr.length; i++){
            while(CountArr[i] > 0){
                arr[j]= i;
                j++;
                CountArr[i]--;
            }
        }
    }


        // print function
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        countSort(arr);
        print(arr);
    }
}
