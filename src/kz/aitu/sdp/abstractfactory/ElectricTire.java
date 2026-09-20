package kz.aitu.sdp.abstractfactory;

public class ElectricTire implements Tire {

    @Override
    public void rotate() {
        System.out.println("Electric tire is rotating");
    }
}
