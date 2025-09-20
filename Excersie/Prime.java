// package Excersie;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        // System.out.println("Hey");
        Scanner sc=new Scanner(System.in);
        int n=100;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==2) System.out.println(n+" is a prime number.");
        else System.out.println(n+" is not a prime number.");
    }
}
