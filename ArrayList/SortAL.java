import java.util.*;

public class SortAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(3);
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);
    }
}
