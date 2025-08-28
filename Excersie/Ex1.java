import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int tot=0;
        double percentage;
        for(int i=0;i<arr.length;i++){
            tot+=arr[i];
        }
        System.out.println(tot);
        percentage=(double)tot*100/500;

        System.out.println(percentage);

        double num = 10.2929292992;
        System.out.println(num);
        System.out.printf("%.2f",num);
    }
}
