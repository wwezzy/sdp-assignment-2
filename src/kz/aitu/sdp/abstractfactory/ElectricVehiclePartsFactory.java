package kz.aitu.sdp.abstractfactory;

public class ElectricVehiclePartsFactory implements VehiclePartsFactory {

    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public Tire createTire() {
        return new ElectricTire();
    }
}
