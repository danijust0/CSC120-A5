public class Engine {
    private FuelType fuel;
    double currentFuelLevel;
    double maxFuelLevel; 

    public Engine (FuelType fuel, double maxFuelLevel) {
        this.fuel = fuel;
        this.currentFuelLevel = maxFuelLevel;
        this.maxFuelLevel =  maxFuelLevel;
    }


    public FuelType getFuelType(){
        return fuel;
    }

    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

    public void go(){
        if (this.currentFuelLevel <= 0) {
            throw new RuntimeException("Fuel level too low! Refuel immediately!");
        } else {
            this.currentFuelLevel --;
            System.out.println("Current Fuel Level:" + this.currentFuelLevel);
        }
    }
 
}