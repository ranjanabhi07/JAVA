import java.util.*;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String equation = sc.nextLine();

        System.out.println(isDuplicate(equation));
        sc.close();
    }
}
