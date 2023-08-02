

public class Subsets {

    // string
    public static void subsets(String str, String Subset, int i){
        //base case
        if(i == str.length()){
            if(Subset.length() == 0){
                System.out.println("null");
            } else {
            System.out.println(Subset);
      
            }
            return;
        }

        //recursion case
        //yes
        subsets(str, Subset+str.charAt(i), i+1);
        //no
        subsets(str, Subset, i+1);
    }

    // arr 
    public static void subsetsArr(int arr[], String sub, int i){
        if(i==arr.length){
            System.out.println(sub+"}");
            return ;
        }

        subsetsArr(arr, sub+arr[i]+",", i+1);
        subsetsArr(arr, sub, i+1);
        return ;
    }

    
    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
        System.out.println();
        int arr[]={1,2,3,4,5};
        subsetsArr(arr, "{", 0);
    }
}
