package design.patterns.SOLID.liskov.wrongexample;


public class Car extends Transport {

    private Car car;

    private String model;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean runEngine() {
        return car.runEngine();
    }
}