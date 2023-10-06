package S101_N2exercise1;

public class Photo_App {
    public static void main(String[] args) {

        Smartphone smarObj = new Smartphone("Samsung", "A32");
        System.out.println(smarObj.toString());
        smarObj.call("678-956-213");
        smarObj.takePic();
        smarObj.alarm();

    }
}
