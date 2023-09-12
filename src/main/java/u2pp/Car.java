package u2pp;

/**
 * This class represents a car‘s gas intake and consumption
 * 
 * @author Regina
 */
 
public class Car {
    private double gas; //The amount of gas in the tank
    private double mpg; //The fuel efficiency of the car in miles per gallon
    private String make; //The make of the car
    private String model; //The model of the car
    
    /**
     * 
     * makes the anEfficiency the mpg and other parameters the make, model, and the gas 0
     * @param anEfficiency - the efficiency of the Car
     * @param aMake - the make of the Car
     * @param aModel - the model of the Car
     */ 
    public Car(double anEfficiency, String aMake, String aModel) {
    	mpg = anEfficiency;
    	make = aMake;
    	model = aModel;
    	gas = 0.0;
    }
    
    /**
     * adds to the number of gallons of gas
     * @param amount - the amount of gas to add to the tank
     */
    public void addGas (double amount) {
        gas += amount;
    }
    
    /**
     * subtracts the a certain amount of gas based on the distance driven
     * @param distance - the distance that the car has driven
     */
    public void drive (double distance) {
        //
    	gas -= distance / mpg;
    }
    
    /** 
     * @return The amount of gas currently in the tank
     */
    public double getGasInTank() {
        //
        return gas;
    }
    
    /**
     * @return The make and model of the car
     */
     public String getMakeAndModel() {
       return make + " " + model;
     }
    
    /**
     * @return The efficiency of the car. Used for testing purposes
     */
    public double getMpg() {
        return mpg;
    }
}