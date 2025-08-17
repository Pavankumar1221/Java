// package Arrays;
import java.util.*;
public class Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // 1-> way of representing array in java
        int[] arr = new int[size];
        // 2-> 
        // int [] arr = {1,2,3,4};
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The elements in the array are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>maxi) maxi=arr[i];
        }
        System.out.println("Maximum number in the above array is: "+maxi);
    }
}
