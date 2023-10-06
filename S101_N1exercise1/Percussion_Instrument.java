package S101_N1exercise1;

public class Percussion_Instrument extends Instrument{
    public Percussion_Instrument(String name, int price){
        super(name, price);
    }
    @Override
    public void play(){
        System.out.println("A percussion instrument is playing.");
    }
    @Override
    public String toString(){
        return "The name of the Percussion instrument is: " + getName() + " and the price is: " + getPrice() + ".";
    }
}
