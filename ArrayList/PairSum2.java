import java.util.*;

public class PairSum2 {

    //BruteForce:- O(n^2)
    public static boolean pairSumBruitForce(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }

        return false;
    }

    //Optimized:- O(n)
    public static boolean pairSumOptimized(ArrayList<Integer> list, int target){
        int pivort =-1;
        int n = list.size();
        for(int i=0; i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivort =i;
                break;
            }
        }

        int Rp = pivort;
        int Lp = pivort+1;
        while(Lp!=Rp){
            if(list.get(Lp)+list.get(Rp)==target){
                return true;
            }

            if(list.get(Lp)+list.get(Rp)>target){
                Rp=(n+Rp-1)%n;
            } else {
                Lp = (Lp+1)%n;
            }
        }


        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=16;

        System.out.println(pairSumOptimized(list, target));

    }
}
