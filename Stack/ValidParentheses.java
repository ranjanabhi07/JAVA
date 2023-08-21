import java.util.*;
public class ValidParentheses {
    public static boolean check(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            } else {
                if(s.isEmpty()){
                    return false;
                } 

                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if(!s.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String parentheses = sc.nextLine();
        System.out.println(check(parentheses));
        sc.close();
    }
}
