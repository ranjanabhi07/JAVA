import java.util.ArrayList;

public class FindMaximumAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }

        System.out.printf("Max element is: %d in the ArrayList",max);
    }
}
