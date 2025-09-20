// package Arrays_Prac;
import java.util.*;

public class Q2 {


    static boolean findElement(int[] arr, int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int val=5;
        if(findElement(arr, val)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
