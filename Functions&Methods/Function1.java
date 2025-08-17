import java.util.*;

public class Function1{

    public static int sumOfTwoNumbers(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        // System.out.println("Hello Pavan.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumOfTwoNumbers(a, b);
        System.out.println("The sum is: "+sum);
    }
}