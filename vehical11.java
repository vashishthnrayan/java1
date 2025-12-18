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
    private int payloadCapacity ;

    public Car(String make, String model, int year, int numDoors , int payloadCapacity) {
        super(make, model, year);
        this.numDoors = numDoors;
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving Car....");
    }

    public int getNumDoors(){
        return numDoors;
    }
    public int getPayloadCapacity(){
        return payloadCapacity;
    }
    @Override
    public String toString(){
        return "Car Details:-\n"+
        "Make: "+getMake()+"\n"+
        "Model: "+getModel()+"\n"+
        "Year: "+getYear()+"\n"+
        "Number of Doors: "+getNumDoors();
    }
}
class Truck extends vehical{
    private int numDoors;
    private int payloadCapacity;

    public Truck(String make, String model, int year, int numDoors, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
        this.numDoors = numDoors;
    }

    @Override
    public void drive() {
        System.out.println("Driving Truck....");
    }

    public int getNumDoors(){
        return numDoors;
    }

    public int getPayloadCapacity(){
        return payloadCapacity;
    }

    @Override
    public String toString(){
        return "Truck Details:-\n"+
        "Make: "+getMake()+"\n"+
        "Model: "+getModel()+"\n"+
        "Year: "+getYear()+"\n"+
        "Number of Doors: "+getNumDoors();
    }
}

public class vehical11 {
    public static void main(String[] args) {
        vehical car= new Car("Toyota","Camry",2020,4,600);
        vehical truck= new Truck("Ford","F-150",2019,2,2500); 

        System.out.println(car);
        System.out.println();
        System.out.println(truck);
        
        car.drive();
        truck.drive();

        System.out.println("-------code is working fine-------");
    }
}
