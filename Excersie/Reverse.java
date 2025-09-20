// package Excersie;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int n = 123456;
        int rev=0;
        int digits=0;
        while(n>0){
            int rem=n%10;
            digits++;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        System.out.println(digits);
    }
}
