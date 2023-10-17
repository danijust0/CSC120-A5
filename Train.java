import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType,fuelCapacity);
        this.cars = new ArrayList<Car>();

        for(int i=0; i<nCars; i++){
            Car car = new Car(passengerCapacity);
            this.cars.add(car);
        }
    }
        
    public Engine getEngine(){
        return this.engine;
    }
        
    public Car getCar(int i){
        return this.cars.get(i);
    }

    public int getMaxCapacity(){
        return this.cars.get(0).getCapacity() * this.cars.size();
    }

    public int seatsRemaining(){
        int totalSeats = 0;
        for (int car=0; car<this.cars.size(); car++){
            totalSeats += cars.get(car).seatsRemaining();
        }
        return totalSeats;
    }

    public void printManifest(){
        for(int car=0; car<this.cars.size();car++){
            System.out.println("Car" + car + ":");
            cars.get(car).printManifest();
        }
    }
}

