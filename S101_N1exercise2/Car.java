package S101_N1exercise2;

public class Car {
    private static final String make;
    private static String model;
    private final int power;

    static {
        make = "Honda";
        model = "Accord";
    }
    public Car(int power){
        this.power = power;
    }
    public String getMake(){
        return Car.make;
    }
    public String getModel(){
        return Car.model;
    }
    public int getPower(){
        return this.power;
    }
    public void setModel(String model){
        Car.model = model;
    }
    public static void brake(){
        System.out.println("The vehicle is slowing down.");
    }
    public void accelerate(){
        System.out.println("The vehicle is speeding up.");
    }
    public String toString(){
        return "The car's make is " + Car.make + ", the model is " + this.model+ " and the power is " + this.power
                + " hp.";
    }
}
