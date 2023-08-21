public class NextGreaterElement{
    public static int[] NextGreater(int arr[]){
        int nextG[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int prev = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > prev){
                    nextG[i] = arr[j];
                    break;
                }
            }
            if(nextG[i] == 0){
                 nextG[i] = -1;
            }
        }
        return nextG;
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

public static void main(String[] args) {
    int arr[] = {9,18,7,10,12};
    print(arr);
    print(NextGreater(arr));
    }
}