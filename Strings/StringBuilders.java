import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pavan");

        // System.out.println(sb);

        // sb.setCharAt(0, 'T');
        // System.out.println(sb);

        // sb.insert(1, "Ku");
        // System.out.println(sb);

        // sb.delete(1, 3);
        // System.out.println(sb);

        // sb.append("K");
        // sb.append("u");
        // sb.append("m");
        // sb.append("a");
        // sb.append("r");
        // System.out.println(sb);

        System.out.println(sb);

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
