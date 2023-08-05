import java.util.*;

public class MultiDimentionalAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        System.out.println("List 1 is: "+list1);
        System.out.println("List 2 is: "+list2);
        System.out.println("List 3 is: "+list3);

        //adding all the list to mainList:-
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println("MainList is: "+mainList);


        // To get all the elements back from the ArrayList:-
        for(int i=0; i<mainList.size();i++){
            ArrayList<Integer> temp = mainList.get(i);
            for(int j=0; j<temp.size(); j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
    }
}
