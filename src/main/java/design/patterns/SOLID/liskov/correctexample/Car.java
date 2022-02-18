package design.patterns.SOLID.liskov.correctexample;

public class Car extends MotorizedTransport {
    private Car car;

    public boolean runCarEngine() {
        return car.runMotorizedTranport();
    }

}
