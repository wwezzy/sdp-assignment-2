package kz.aitu.sdp.factorymethod;

public class TwoWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}