public class Permutations {
    public static void permutation(String str, String perms){
        if(str.length() == 0){
            System.out.println(perms);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String Str = str.substring(0, i)+ str.substring(i+1);
            permutation(Str, perms+currentChar);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
