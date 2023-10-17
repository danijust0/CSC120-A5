import java.util.ArrayList;

public class Train {

    /** Stores engine cannot be changed */
    private final Engine engine;

    /** Stores list of Cars */
    private ArrayList<Car> cars;

    /** Constructor for Train */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType,fuelCapacity);
        this.cars = new ArrayList<Car>();

        for(int i=0; i<nCars; i++){
            Car car = new Car(passengerCapacity);
            this.cars.add(car);
        }
    }
    
    /** Accessor for Train's Engine type */
    public Engine getEngine(){
        return this.engine;
    }
    
    /** Returns the ith car 
     * @param i
    */
    public Car getCar(int i){
        return this.cars.get(i);
    }

    /** Returns the capacity of the first car in this.cars multiplied by the number of cars in this.cars */
    public int getMaxCapacity(){
        return this.cars.get(0).getCapacity() * this.cars.size();
    }

    /** Returns the total of empty seats across all cars */
    public int seatsRemaining(){
        int totalSeats = 0;
        for (int car=0; car<this.cars.size(); car++){
            totalSeats += cars.get(car).seatsRemaining();
        }
        return totalSeats;
    }

    /** Loops through and prints the manifest of each car */
    public void printManifest(){
        System.out.println("MANIFEST");
        for(int car=0; car<this.cars.size();car++){
            System.out.println("Car" + car + ":");
            cars.get(car).printManifest();
        }
    }
}

