public class Engine {

    /** Stores fuel variable*/
    private FuelType fuel;

    /** Stores current fuel level */
    double currentFuelLevel;

    /** Stores current max level */
    double maxFuelLevel; 

    /** Constructor for Engine */
    public Engine (FuelType fuel, double maxFuelLevel) {
        this.fuel = fuel;
        this.currentFuelLevel = maxFuelLevel;
        this.maxFuelLevel =  maxFuelLevel;
    }

    /** Accessor for FuelType in engine*/
    public FuelType getFuelType(){
        return fuel;
    }

    /** Manipulator that sets current fuel level equal to max fuel level.*/
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /** Decrements fuel level until fuel level is 0 */
    public void go(){
        if (this.currentFuelLevel <= 0) {
            throw new RuntimeException("Fuel level too low! Refuel immediately!");
        } else {
            this.currentFuelLevel --;
            System.out.println("Current Fuel Level:" + this.currentFuelLevel);
        }
    }
 
}