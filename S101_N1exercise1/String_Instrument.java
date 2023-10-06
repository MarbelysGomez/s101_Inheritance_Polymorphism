package S101_N1exercise1;

public class String_Instrument extends Instrument{

    public String_Instrument(String name, int price){
        super(name, price);
    }
    @Override
    public void play(){
        System.out.println("A string instrument is playing.");
    }
    @Override
    public String toString(){
        return "The name of the String instrument is: " + getName() + " and the price is: " + getPrice() + ".";
    }
}
