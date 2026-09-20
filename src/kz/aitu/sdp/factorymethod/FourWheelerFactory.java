package kz.aitu.sdp.factorymethod;

public class FourWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}