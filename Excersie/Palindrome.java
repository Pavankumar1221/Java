// package Excersie;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String s="1233a21";
        int j=s.length()-1;
        // System.out.println(j);
        int i=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("not a palindrome");
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
        
    }
}
