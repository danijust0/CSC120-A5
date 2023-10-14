import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    public Car (int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>();
    }

    public int getCapacity(){
        return this.maxCapacity;
    }

    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnboard.size();
    }

    public void addPassenger(Passenger p){
        if (this.passengersOnboard.contains(p)){
            throw new RuntimeException("Passenger already on board.");
        } else {
            this.passengersOnboard.add(p);
        }
    }

    public void removePassenger(Passenger p){
        if (this.passengersOnboard.contains(p) == false){
            throw new RuntimeException("Passenger is not on board.");
        } else {
            this.passengersOnboard.remove(p);
        }
    }

    public void printManifest(){
        if (this.passengersOnboard.isEmpty()){
            throw new RuntimeException("This car is empty!");
        } else {
           for (Passenger p : passengersOnboard) {
                System.out.println(p.getName());
           }
        }
    }
}