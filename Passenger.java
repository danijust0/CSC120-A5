public class Passenger {

    /** Stores name of passenger*/
    private String name;

    /** Constructor for Passenger */
    public Passenger(String name) {
        this.name = name;
    }

    /** Accessor for Passenger name */
    public String getName(){
        return this.name;
    }

     /** Tries to add passenger to a car, if error is caught in addPassenger method, throws error 
      * @param Car
     */
    public void boardCar(Car c){
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    /** Tries to remove passenger from a car, if error is caught in removePassenger method, throws error
     * @param Car
     */
    public void getOffCard(Car c){
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
