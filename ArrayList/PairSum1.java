import java.util.ArrayList;

public class PairSum1 {

    //BruteForce:- O(n^2)
    public static void pairSum1Bruteforce(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j) == target){
                    System.out.printf("%d is found at index %d,%d",target,i,j);
                    return;
                }
            }
        }
        System.out.println("not found");
    }

    //Optimized:- O(n)
    public static void pairSum1Optimized(ArrayList<Integer> list, int target){
        int Lp = 0;
        int Rp = list.size()-1;
        while(Lp<Rp){
            if(list.get(Lp)+list.get(Rp)==target){
                System.out.printf("%d is found at index %d,%d",target,Lp,Rp);
                return;
            }

            if(list.get(Lp)+list.get(Rp)>target){
                Rp--;
            } else {
                Lp++;
            }
        }

        System.out.println("not found");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int Target = 50;

        // pairSum1Bruteforce(list, Target);
        
        pairSum1Optimized(list, Target);
    }
}
