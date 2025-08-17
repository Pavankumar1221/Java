

public class Factorial {

    public static int findFactorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }

    public static void main(String[] args){
        int n = 4;
        int ans = findFactorial(n);
        System.out.println("The Factorial of num 4 is: "+ans);
    }
}
