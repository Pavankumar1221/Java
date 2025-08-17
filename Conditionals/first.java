import java.util.*;
public class first {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("You are allowed to get a driving licence");
        }else{
            System.out.println("Not eligible to get a driving licence");
        }
    }
}
