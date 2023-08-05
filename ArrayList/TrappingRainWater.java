import java.util.*;

public class TrappingRainWater {
    public static int trappingWater(ArrayList<Integer> list){
        int totalWater = 0;
        System.out.println(list);

        ArrayList<Integer> leftList = new ArrayList<>();
        leftList.add(list.get(0));
        for(int i=1; i<list.size(); i++){
            int max = Math.max(leftList.get(i-1),list.get(i));
            leftList.add(max);
        }
        System.out.println(leftList);

        ArrayList<Integer> rightList = new ArrayList<>();
        rightList.add(list.get(list.size()-1));
        
        int a = 0;
        for(int i=list.size()-2; i>=0; i--){
            int max = Math.max(rightList.get(a),list.get(i));
            a++;
            rightList.add(max);
        }
        Collections.sort(rightList,Collections.reverseOrder());

        System.out.println(rightList);

        for(int i=0; i<list.size(); i++){
            int height = Math.min(leftList.get(i), rightList.get(i));
            totalWater += height - list.get(i);
        }

        return totalWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(2);
        list.add(5);



        System.out.println(trappingWater(list));
    }
}
