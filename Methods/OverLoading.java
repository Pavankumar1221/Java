// package Methods;
import java.util.*;

public class OverLoading {

    static void myMethod(int i, int j){
        System.out.println(i+j);
    }
    static void myMethod(double i, double j){
        System.out.println(i+j);
    }
    static void myMethod(String i, String j){
        System.out.println(i+" "+j);
    }



    public static void main(String[] args) {
        myMethod(2,2);
        myMethod(2.5,2.5);
        myMethod("Pavan Kumar","Pedakota");
    }
}
