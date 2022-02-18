package design.patterns.SOLID.liskov.wrongexample;

public class Bike extends Transport {

    Bike bike = new Bike();

    public boolean runEngine() {
        return bike.runTransportEngine();
        //        ?????????
    }
}