// package Excersie;
import java.util.*;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                a+=arr[i];
            }else{
                b+=arr[i];
            }
        }
        System.out.println(a^b);

    }
}
