import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // List<Integer> list = new ArrayList<>(); 
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        for(int i=0;i<3;i++){
            list.add(sc.nextInt());
        }
        int sum=0;
        for(int i=0;i<3;i++){
            sum = sum+list.get(i);
        }
        System.out.println(list);
        System.out.println(sum);
    }
}
