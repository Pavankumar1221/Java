import java.util.*;
public class Strings1 {
    public static void main(String[] args) {
        // String s="Hello";
        // for(char ch:s.toCharArray()){
        //     System.out.println(ch);
        // }

        // char[] arr={'a','b','c','d'};
        // String s=new String(arr);
        // System.out.println(s);


        // Remove all special chars 
        String s="Hello bastard! you are fucking scrolling everyday getting fuckin cheap dopamin everytime.78784444()*&^%%$";
        String ignoreSpecial=s.replaceAll("[^A-Za-z0-9.\\s]","");
        System.out.println(ignoreSpecial);

    }
}
