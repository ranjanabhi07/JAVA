import java.util.*;

public class ContainerWithMostWater {

    //Bruteforce code:-  O(n^2)
    public static int MaxArea(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int length = Math.min(list.get(i),list.get(j));
                int breadth = j-i;
                int area = (length * breadth);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    //Optimized :- by two pointer approach  O(n)
    public static int MaxAreaOptimized(List<Integer> list){
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = list.size()-1;

        while(left<right){
            int length = Math.min(list.get(left),list.get(right));
            int breadth = right-left;
            int area = (length*breadth);
            max = Math.max(max,area);

            if(list.get(left)<list.get(right)){
                left++;
            } else{
                right--;
            }
        }
        return max;
    }
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(MaxAreaOptimized(list));

    }
}
