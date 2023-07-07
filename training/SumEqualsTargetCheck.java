public class SumEqualsTargetCheck {

    public static void targetEqualSum(int arr[], int target){ // o(n^2)
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("the values that are equal are: "+ arr[i]+" & "+ arr[j]+ " at index "+i+","+j+" equal to "+ target);
                }
            }
        }
    }

    public static void target(int arr[], int target){ //o(n^2)
        int j= arr.length-1;
        for(int i=0; i<arr.length; i++){
            while(j > 0){
               if(arr[i]+arr[j] == target){
                    System.out.println("the values that are equal are: "+ arr[i]+" & "+ arr[j]+ " at index "+i+","+j+" equal to "+ target);
                    j--;
                } else {
                    j--;
                } 
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 1, 3};
        int target = 9;
        targetEqualSum(arr,target);
        System.out.println();
        target(arr, target);
    }
}
