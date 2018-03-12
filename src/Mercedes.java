package plyzwa;

public class Mercedes extends plyzwa.Car {

    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }
    void startEngine() {
        super.startEngine();
        System.out.println(this.getClass() + " is starting");

    }
}
