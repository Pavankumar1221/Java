// package Excersie;
import java.util.*;

public class Fibo {

    static int findSum(int n){
        int a=0;
        int b=1;
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n+1;i++){
            int sum = arr[i-1]+arr[i-2];
            arr[i]=sum;
        }
        int ans = 0;
        for(int i=0;i<n+1;i++){
            if(arr[i]%2==0) ans+=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int ans = findSum(n);
        System.out.println(ans);
    }
}
