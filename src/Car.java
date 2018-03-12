package plyzwa;

public class Car {

    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }
    void startEngine() {
        System.out.println("Engine is starting");
    }
    void accelerate() {
        System.out.println("Car is Accelerating");
    }
    void brake() {
        System.out.println("Car is braking");
    }
}
