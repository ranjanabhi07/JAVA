import java.util.*;

public class PrintNameInFunction {
    
    public static void printName(String name){
        System.out.print("Name is: ");
         System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rhe name: ");
        String name = sc.nextLine();

        printName(name);
        printName(name);
        printName(name);
        printName(name);
        printName(name);
    }
}
