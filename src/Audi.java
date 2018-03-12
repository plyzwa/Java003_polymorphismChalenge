package plyzwa;

public class Audi extends plyzwa.Car {

    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }
    void startEngine() {
        super.startEngine();
        System.out.println(this.getClass() + " is starting");

    }
}
