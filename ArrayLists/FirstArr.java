import java.util.*;

public class FirstArr {
    public static void main(String[] args) {
    //     add()	Adds an element to the end of the list
    //     get()	Returns the element at the specified position
    //     set()	Replaces the element at the specified position
    //     remove()	Removes the element at the specified position
    //     size()	Returns the number of elements in the list
    // 
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(23);
        arr.add(233);
        arr.add(234);
        arr.add(231);

        arr.add(0, 233332);
        int index = 0; 
        // arr.remove(0);
        System.out.println(arr.get(0));
        System.out.println(arr);

        int n = arr.size();
        System.out.println(n);

        Collections.sort(arr);
        for(int i:arr){ 
            System.out.print(i+" ");
        }
        System.out.println();

        Collections.sort(arr, Collections.reverseOrder());

        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
