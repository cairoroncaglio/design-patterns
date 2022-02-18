package design.patterns.SOLID.liskov.wrongexample;


public class Transport {
    public String name;
    public Motor motor;

    public Boolean runTransportEngine() {
        return motor.runEngine();
    }
}