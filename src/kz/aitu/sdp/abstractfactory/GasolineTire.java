package kz.aitu.sdp.abstractfactory;

public class GasolineTire implements Tire {

    @Override
    public void rotate() {
        System.out.println("Gasoline tire is rotating");
    }
}