abstract class vehical{
    private String make;
    private String model;
    private int year;

    public vehical(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void drive();

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }
}
class Car extends vehical{
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void drive() {
        System.out.println("Driving Car....");
    }

    public int getNumDoors(){
        return numDoors;
    }
}
class Truck extends vehical{
    private int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving Truck....");
    }

    public int getPayloadCapacity(){
        return payloadCapacity;
    }
}

public class vehical11 {
    public static void main(String[] args) {
        vehical car= new Car("Toyota","Camry",2020,4);
        vehical truck= new Truck("Ford","F-150",2019,2000); 
        
        car.drive();
        truck.drive();
    }
}
