package S101_N1exercise1;

public abstract class Instrument {
    private String name;
    private int price;
    private static int numberOfInstruments;

    static {
        System.out.println("Accessing a static block of the Instrument class.");
        initializeNumberOfInstruments();
    }
    private static void initializeNumberOfInstruments() {
        numberOfInstruments = 0;
    }

    public Instrument(String name, int price){
        this.name = name;
        this.price = price;
        numberOfInstruments++;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public static int getNumberOfInstruments() {
        return numberOfInstruments;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public abstract void play();
    public String toString(){
        return "The name of the instrument is " + this.name + " and the price is " + this.price + ".";
    }
}
