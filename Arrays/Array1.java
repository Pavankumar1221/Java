import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Integer[] arr={5,4,3,2,1};
        Arrays.sort(arr, (a,b)->b-a);
        System.out.println(Arrays.toString(arr));

    }
}
