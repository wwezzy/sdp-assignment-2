package kz.aitu.sdp.abstractfactory;

public class GasolineVehiclePartsFactory implements VehiclePartsFactory {

    @Override
    public Engine createEngine() {
        return new GasolineEngine();
    }

    @Override
    public Tire createTire() {
        return new GasolineTire();
    }
}