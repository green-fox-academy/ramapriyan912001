package Flyable;

public abstract class Vehicle implements Flyable {
    private String colour;
    private int age;
    private int yearOfManufacture;

    public Vehicle(String colour, int age, int yearOfManufacture) {
        this.colour = colour;
        this.age = age;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public void fly() {
        System.out.println("i believe I can fly");
    }

    @Override
    public void land() {
        System.out.println("I believe I can land");
    }

    @Override
    public void takeOf() {
        System.out.println("I believe I can takeoff");
    }
}
