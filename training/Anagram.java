import java.util.*;
public class Anagram {
    public static boolean checkAnagram(String str1[], String str2[]){
        if(str1.length != str2.length){
            return false;
        }

        System.out.println("Before sorting ");
        // printing the given arr;
        for(int i=0; i<str1.length; i++){
            System.out.print(str1[i]+" ");
        }

        System.out.println();

        for(int i=0; i<str2.length; i++){
            System.out.print(str2[i]+" ");
        }

        System.out.println();

        System.out.println("After sorting");
        // after sorting the arr

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0; i<str1.length; i++){
            System.out.print(str1[i]+" ");
        }

        System.out.println();

        for(int i=0; i<str2.length; i++){
            System.out.print(str2[i]+" ");
        }

        // checking it is anagram or not 
        for(int i=0; i<str1.length; i++){
            if(str1[i] != str2[i])
                return false;
        }
        System.out.println();
        return true;   
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        String word1[] = {"R","A","C","E"};
        String word2[] = {"C","A","R","E"};
        System.out.println(checkAnagram(word1, word2));
    }
}

