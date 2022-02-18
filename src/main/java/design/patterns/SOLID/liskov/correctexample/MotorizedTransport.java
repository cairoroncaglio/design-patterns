package design.patterns.SOLID.liskov.correctexample;

public class MotorizedTransport extends Transport {
    private Motor motor;

    public Boolean runMotorizedTranport() {
        return motor.runEngine();
    }
}