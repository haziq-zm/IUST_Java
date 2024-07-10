
class Vehicle{
    void start(){
        System.out.println("Vehicle started");
    }
    
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car started");
    }
}
public class Main{
    public static void main(String args[]){
        Vehicle obj = new Vehicle();
        obj.start();
        Car obj1 = new Car();
        obj1.start();
    }
}


