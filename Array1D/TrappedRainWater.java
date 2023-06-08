package Array1D;

public class TrappedRainWater {
    public static int trappedwater(int arr[]){
        int n = arr.length;

        int LeftMax[] = new int[n];
        LeftMax[0] = arr[0];
        for(int i=1; i<n; i++){
            LeftMax[i] = Math.max(arr[i], LeftMax[i-1]);
        }

        int RightMax[] = new int[n];
        RightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            RightMax[i] = Math.max(arr[i],RightMax[i+1]);
        }

        int trappedwaters = 0;
        for(int i=0; i<n; i++){
            int Boundary = Math.min(LeftMax[i],RightMax[i]);
            trappedwaters += Boundary - arr[i];
        }

        return trappedwaters;
    }
    public static void main(String[] args) {
        int arr[]= {4,2,0,6,3,2,5};
        System.out.println(trappedwater(arr));
    }
}
