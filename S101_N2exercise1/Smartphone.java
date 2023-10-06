package S101_N2exercise1;

public class Smartphone extends Phone implements Camera, Clock{

     public Smartphone(String make, String model){
        super(make, model);
    }
    @Override
    public void takePic() {
        System.out.println("A photo is being taken.");
    }
    @Override
    public void alarm() {
        System.out.println("The alarm is ringing.");
    }
}
