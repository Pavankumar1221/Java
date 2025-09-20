import java.util.*;

public class HashMapss {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(3);

        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
    }
}
