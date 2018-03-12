package plyzwa;

public class Bmw extends plyzwa.Car {

    public Bmw(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    void startEngine() {
        System.out.println(this.getClass() + "is starting");
        super.startEngine();
    }

    @Override
    void accelerate() {
        System.out.println(this.getClass() + "is faster");
        super.accelerate();
    }

    @Override
    void brake() {
        System.out.println(this.getClass());
        super.brake();
    }
}
