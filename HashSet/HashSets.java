import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(1);
        hash.add(2);
        hash.add(1);
        hash.add(3);
        hash.add(1);
        hash.add(1);

        for(int i:hash){
            System.out.print(i + " ");
        }
        System.out.println(hash.contains(2));
    }
}
