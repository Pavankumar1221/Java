import java.util.*;

public class Var{
    public static void main(String[] args){
        // String s1="Pavan is my name.";
        // System.out.println(s1);
        Scanner sc= new Scanner(System.in);
        // System.out.print("Enter your name: ");
        
        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println("My name is: "+name);
        // int i=sc.nextInt();
        // System.out.println(i);

        System.out.println("Enter value to a: ");
        int a = sc.nextInt();
        System.out.println("Enter value to b: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of a and b: "+sum);

    }
}