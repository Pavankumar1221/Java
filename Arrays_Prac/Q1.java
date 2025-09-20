// package Arrays_Prac;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        double[] arr=new double[]{98.88,45.12154,777.1545};

        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.printf("%.3f",sum);

    }
}
