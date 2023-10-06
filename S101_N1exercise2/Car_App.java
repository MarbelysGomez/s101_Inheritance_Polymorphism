package S101_N1exercise2;

public class Car_App {
    public static void main(String[] args) {

        Car carObj = new Car(120);

        Car.brake();

        carObj.accelerate();

        System.out.println(carObj.toString());

    }
}
