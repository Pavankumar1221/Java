import java.sql.Time;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Pavan";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        

        // Trim
        String notTrim = "      Pavan      ";
        System.out.println(notTrim);
        String Trim = notTrim.trim();
        System.out.println(Trim);


        // Sub String
        String s="Pedakota Pavan Kumar";
        // start from index goes till end.
        System.out.println(s.substring(0));
        // start from 0 goes till 4th index
        System.out.println(s.substring(0,5));



        // Replace
        System.out.println(s.replace('a', 'p'));
        System.out.println(s.replace("Pavan", "ratan"));


        // Starts with
        System.out.println(s.startsWith("Pe"));

        // endWith
        System.out.println(s.endsWith("Pe"));

        // charAt
        System.out.println(s.charAt(0));

        // indexOf
        System.out.println(s.indexOf('P'));

        // equals
        System.out.println(s.equals("Pedakota Pavan Kumar"));
        System.out.println(s.equalsIgnoreCase("pedakota pavan kumar"));

    }
}
