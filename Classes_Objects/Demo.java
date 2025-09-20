import java.util.*;

class Calculator{

    public int add(int a, int b){
        return a+b;
    }

};

public class Demo {
    public static void main(String args[]){

        Calculator cal = new Calculator();
        int res = cal.add(2,3);
        System.out.println(res);

    }
}
