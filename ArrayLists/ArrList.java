import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter "+n+ " elements: ");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr.add(num);
        } 

        System.out.println(arr);

        System.out.println("Sorted representation of this array: ");
        Collections.sort(arr);
        System.out.println(arr);

    }
}
