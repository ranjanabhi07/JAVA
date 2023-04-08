// name1.compareTo(name2)

/* 
It will give 3 outputs 
    1) if name1 == name2 then = 0   
    2) if name1 > name2  then = +ve value
    3) if name1 < name2  then = -ve value 
*/

public class CompareTwoStrings {
    public static void main(String[] args) {
        String name1 = "Abhishek ";
        String name2 ="Abhishek";

        if(name1.compareTo(name2) == 0){
            System.out.println("the strings are equal!");
        } else if (name1.compareTo(name2) > 0){
            System.out.println("String "+name1+ " is greater then string "+name2);
        } else {
            System.out.println("The string "+name1+ " is smaller then string "+name2);
        }
    }
}
