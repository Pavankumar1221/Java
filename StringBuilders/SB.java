import java.util.*;

class SB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // StringBuilder sb = new StringBuilder(50);
        // sb.append("Pavan ").append(21);
        // System.out.println(sb);

        String[] words={"rohit","virat","hardik"};
        StringBuilder sb=new StringBuilder();

        for(String word:words){
            if(sb.length()>0){
                sb.append(", ");
            }
            sb.append(word);
        }
        String result=sb.toString();
        System.out.println(result);
    }
};