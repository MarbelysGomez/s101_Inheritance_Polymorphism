package S101_N1exercise1;

public class Wind_Instrument extends Instrument{

    public Wind_Instrument(String name, int price){
        super(name, price);
    }
    @Override
    public void play(){
        System.out.println("A wind instrument is playing.");
    }
    @Override
    public String toString() {
        return "The name of the Wind instrument is: " + getName() + " and the price is: " + getPrice() + ".";
    }
}