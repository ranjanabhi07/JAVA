import java.util.*;
public class FindElement {
    public int Find(int arr[], int value, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==value){
            return mid;
        }
        if(si<=mid){
            if(arr[si] <= value && value <= arr[mid-1]){
                return Find(arr, value, si, mid-1);
            } else {
                return Find(arr, value, mid+1, ei);
            }
        } else {
            if(arr[mid+1] <= value && value <= arr[ei]){
                return Find(arr, value, mid+1, ei);
            }
            else {
                return Find(arr, value, si, mid-1);
            }
        } 
    } 
    public static void main(String[] args) {
        FindElement fe = new FindElement();
        Scanner sc = new Scanner(System.in);
        int arr[]= {3,4,5,6,7,0,1,2};
        System.out.print("Enter the Target value: ");
        int value = sc.nextInt();
        int index = fe.Find(arr,value,0,arr.length-1);
        System.out.println(index);
        sc.close();
    }
}
