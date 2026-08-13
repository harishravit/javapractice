package abstract_practice;
abstract class Vechicle{
    abstract void drive();
    void engine(){
        System.out.println("Engine is ready");
    }
    void fuel(){
        System.out.println("fuel is full");
    }
}
class Car extends Vechicle{
    void drive(){
        engine();
    }
    void breake(){
        System.out.println("Breake is ready");
    }
    void accelator(){
        System.out.println("accelator is ready");
    }
    void clutch(){
        System.out.println("accelator is ready");
    }
}
public class practice_abstract {
    public static void main(String[] args) {
        Car car=new Car();
        car.drive();
        car.accelator();
    }
}
