package S101_N2exercise1;

public class Phone{

    private String make;
    private String model;

    //constructor
    public Phone(String make, String model){
        this.make = make;
        this.model = model;
    }
    //getters
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    //setters
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    //methods
    public void call(String phoneNumber){
        System.out.println("The number " + phoneNumber + " is being called.");
    }
    public String toString(){
        return "The phone's make is " + this.make + " and the model is " + this.model + ".";
    }
}
