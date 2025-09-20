import java.util.*;

class Car{
    String name;
    String CarName;
    
    void Driving(){
        System.out.println(name+" is driving the car. Name of the car is: "+CarName);
    }
}




public class Demo2 {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();

        c1.name="Pavan";
        c1.CarName="BMW";

        c2.name="Ratan";
        c2.CarName="Audii";

        c1.Driving();
        c2.Driving();


    }
}
