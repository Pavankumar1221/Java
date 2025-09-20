// package Collections.ArrayList;
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1,30);
        System.out.println(list);


        int x=list.get(1);
        System.out.println(x);

        list.set(1,40);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
