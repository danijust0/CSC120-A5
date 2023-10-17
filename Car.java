import java.util.ArrayList;

public class Car {

    /** Stores passenger list */
    private ArrayList<Passenger> passengersOnboard;

     /** Stores max capacity variable */
    private int maxCapacity;

    /** Constructor for Car */
    public Car (int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>();
    }

    /** Accessor for max capacity of a car */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /** Returns the number of empty seats in a car */
    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnboard.size();
    }

     /** Adds passenger to car, checks for open seats and if passenger is already on board.
     * @param Passenger 
     */
    public void addPassenger(Passenger p){
        if (this.passengersOnboard.contains(p)){
            throw new RuntimeException("Passenger already on board.");
        } else if(this.seatsRemaining() == 0){
            throw new RuntimeException("No seats Remaining");
        } else {
            this.passengersOnboard.add(p);
        }
       
    }

    /** Removes passenger from car, checks if passenger is on board.
     * @param Passenger 
     */
    public void removePassenger(Passenger p){
        if (this.passengersOnboard.contains(p) == false){
            throw new RuntimeException("Passenger is not on board.");
        } else {
            this.passengersOnboard.remove(p);
        }
    }

    /** Prints out the names of passengers in a car, checks if car has passengers*/
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