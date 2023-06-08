package Array1D;


public class PairsOfArray {
    public static void pairsOfArrays(int arr[]){
        int total = 0;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                System.out.print("(" +arr[i]+","+arr[j]+")");
                total++;
            }
            System.out.println();
            
            
        }
        System.out.println("total no of pairs "+ total);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairsOfArrays(arr);
    }
    
}
