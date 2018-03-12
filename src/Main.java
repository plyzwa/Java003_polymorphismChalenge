package plyzwa;

public class Main {
    public static void main(String[] args) {
        plyzwa.Car car = new plyzwa.Car("base car", 8);
        car.startEngine();
        car.accelerate();
        car.brake();
        plyzwa.Bmw bmw = new plyzwa.Bmw("I5", 6);
        bmw.startEngine();
        bmw.brake();
        bmw.accelerate();
        
    }
}
