// step1:- import the package
import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        //step2:- create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        //operation :- adding elements in ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // ArrayList<Integer> List2 = new ArrayList<>();

        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }

        // System.out.println("list 2 : "+List2);

        System.out.println(list);

        //operation1:-  get element in ArrayList
        int a = list.get(2);
        System.out.println(a);

        //operation2:- remove/delete from ArrayList
        list.remove(2);
        System.out.println(list);

        //opertation3:- set elements in ArrayList
        list.set(2,10);
        System.out.println(list);

        //operation4:- contains element in ArrayList or not it returns boolean value
        System.out.println(list.contains(1));
        System.out.println(list.contains(99));

        //operation5:- add element by using index in ArrayList
        list.add(2,3);
        System.out.println(list);

        //operation6:- get size of ArrayList
        System.out.println(list.size());

    }
}
