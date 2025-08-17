
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Pavan Kumar";
        // System.out.print("Enter your name: ");
        // String fname = sc.nextLine();
        // String lname = sc.nextLine();
        // Concatination
        // String fullName = fname+lname;
        // System.out.println("Name is:- "+fullName);

        // To find length of a string
        System.out.println(name.length());

        // charAt
        // for(int i=0;i<name.length();i++){
        //     System.out.println(name.charAt(i));
        // }

        // CompareTo
        // This will check by 3 conditions:
        // 1. s1>s2  ----->  returns +ve value;
        // 2. s1=s2  ----->  returns 0;
        // 3. s1<s2  ----->  returns -ve value;
        String s1="Pavan";
        String s2="pavan";
        // if(s1.compareTo(s2)==0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Both strings are not equal");
        // }
        // if(s1==s2){
        //     System.out.println("Both are equal");
        // }else{
        //     System.out.println("Not equal");
        // }

        // Substring
        System.out.println(s1.substring(1));

        // Strings are immutable 
        s1="Hello";
        System.out.println(s1);
    }
}
