 class Vehicle {
    public void Service(){
        System.out.println("Vehicle is Service");
    }
}
     class Car  extends Vehicle{
    public void Service(){
        super.Service();
        System.out.println("Car is Serviced>.....");
    }
        
    }
    

public class overrideExample {
    public static void main(String[] args) {
        Vehicle vah= new Vehicle();
        Car car = new Car();
    vah.Service();
    car.Service();
    }
        
    }
