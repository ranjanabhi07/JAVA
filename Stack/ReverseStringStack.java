import java.util.*;

public class ReverseStringStack {

    public static void reverseString(String str){
        Stack<Character> s = new Stack<>();
        
        int i = 0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
    public static void main(String[] args) {
        // Stack<Character> s = new Stack<>();
        String string = "abcd";
        reverseString(string);
        
    }
}
